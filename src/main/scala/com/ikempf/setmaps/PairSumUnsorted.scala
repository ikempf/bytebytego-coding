package com.ikempf.setmaps

import scala.collection.mutable
import scala.util.boundary
import scala.util.boundary.break

def pairSum(input: Vector[Int], target: Int): Option[(Int, Int)] =
  val map = mutable.Map.empty[Int, Int]
  val indexed = input.zipWithIndex

  indexed.foreach((i, idx) => map.put(i, idx))

  def rec(i: Int, idx: Int): Option[(Int, Int)] =
    val dual = target - i
    map
      .get(dual)
      .map(dualIdx => (idx, dualIdx))
      .orElse(Option.when(idx + 1 < input.size)(rec(input(idx + 1), idx + 1)).flatten)

  input.headOption.flatMap(h => rec(h, map(h)))

def pairSum2(input: Vector[Int], target: Int): Option[(Int, Int)] =
  val map = mutable.Map.empty[Int, Int]
  val indexed = input.zipWithIndex

  for i <- input.indices do
    map.put(input(i), i)
    val dual = target - i
    val res = map.get(dual)
    if res.isDefined then return Some(res.get, i)
    
  None