package com.ikempf.twopointers

import scala.annotation.tailrec

def twoSum(input: Vector[Int], target: Int): Option[(Int, Int)] =
  var left = 0
  var right = input.length - 1

  while left < right do
    val sum = input(left) + input(right)
    if sum < target then left = left + 1
    else if sum > target then right = right - 1
    else return Some((left, right))

  None

def twoSumRec(input: Vector[Int], target: Int): Option[(Int, Int)] =
  @tailrec
  def twoSumInner(left: Int, right: Int): Option[(Int, Int)] =
    if left >= right then None
    else if input(left) + input(right) < target then twoSumInner(left + 1, right)
    else if input(left) + input(right) > target then twoSumInner(left, right - 1)
    else Some((left, right))

  twoSumInner(left = 0, right = input.length - 1)
