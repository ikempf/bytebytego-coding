package com.ikempf.twopointers

import scala.annotation.tailrec

def pairSum(input: Vector[Int], target: Int): Option[(Int, Int)] =
  var left = 0
  var right = input.length - 1

  while left < right do
    val sum = input(left) + input(right)
    if sum < target then left = left + 1
    else if sum > target then right = right - 1
    else return Some((left, right))

  None

def pairSumRec(input: Vector[Int], target: Int): Option[(Int, Int)] =
  @tailrec
  def pairSumInner(left: Int, right: Int): Option[(Int, Int)] =
    if left >= right then None
    else if input(left) + input(right) < target then pairSumInner(left + 1, right)
    else if input(left) + input(right) > target then pairSumInner(left, right - 1)
    else Some((left, right))

  pairSumInner(left = 0, right = input.length - 1)
