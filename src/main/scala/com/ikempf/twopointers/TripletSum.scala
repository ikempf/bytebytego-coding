package com.ikempf.twopointers

def tripletSum(input: Vector[Int]): Set[(Int, Int, Int)] =
  val sorted = input.sorted

  Range
    .inclusive(0, input.size - 1)
    .flatMap: idx =>
      val fixed = sorted(idx)
      twoSum(sorted.drop(idx + 1), target = -fixed)
        .map { (a, b) => (a, b, fixed) }
    .map { case (a, b, c) => Vector(a, b, c).sorted }
    .toSet
    .collect { case Vector(a, b, c) => (a, b, c) }

private def twoSum(input: Vector[Int], target: Int): Vector[(Int, Int)] =
  var left = 0
  var right = input.length - 1
  var results = Vector.empty[(Int, Int)]

  while left < right do
    val sum = input(left) + input(right)
    if sum < target then left = left + 1
    else if sum > target then right = right - 1
    else
      results = results :+ (input(left), input(right))
      left = left + 1

  results
