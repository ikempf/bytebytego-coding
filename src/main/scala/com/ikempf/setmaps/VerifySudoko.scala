package com.ikempf.setmaps

import cats.kernel.Semigroup
import cats.syntax.monoid.*

import scala.collection.mutable
import scala.util.boundary
import scala.util.boundary.{Label, break}

case class Result(valid: Boolean, reason: Option[String])

object Result:
  val Ok: Result = Result(true, None)
  given Semigroup[Result] = Semigroup.instance((a, b) =>
    Result(
      a.valid && b.valid,
      Some(List(a.reason, b.reason).flatten).filter(_.nonEmpty).map(_.mkString(";"))
    )
  )

private type Read = (Int, Int) => Int

// Memory optimized solution (only one set is used, but board is traversed 3 times)
def verifyAxis(board: Vector[Vector[Int]]): Result =
  val nine = mutable.Set.empty[Int]
  val hasNoDuplicatesHorizontally = verifyAxis(nine, (i, j) => board(i)(j), "Column")
  val hasNoDuplicatesVertically = verifyAxis(nine, (i, j) => board(j)(i), "Line")
  val hasNoDuplicatesInCells = verifyCells(nine, board)
  hasNoDuplicatesHorizontally |+| hasNoDuplicatesVertically |+| hasNoDuplicatesInCells

private def verifyAxis(nine: mutable.Set[Int], read: (Int, Int) => Int, axis: String): Result =
  boundary:
    verifyAxis_(nine, read, axis)
    nine.clear()
    Result.Ok

private def verifyAxis_(nine: mutable.Set[Int], read: Read, axis: String)(using Label[Result]) =
  Range(0, 9).map: i =>
    nine.clear()
    Range(0, 9).map: j =>
      val value = read(i, j)
      if value != 0 && !nine.add(value) then
        break(Result(false, Some(s"$axis ${i + 1}, number $value")))

def verifyCells(nine: mutable.Set[Int], board: Vector[Vector[Int]]) =
  boundary {
    Range(0, 3).map: i =>
      Range(0, 3).map: j =>
        nine.clear()
        Range(0, 3).map: n =>
          Range(0, 3).map: m =>
            val value = board(i * 3 + n)(j * 3 + m)
            if value != 0 && !nine.add(value) then
              break(Result(false, Some(s"Cell ${(i * 3) + j + 1}, number $value")))
    Result.Ok
  }
