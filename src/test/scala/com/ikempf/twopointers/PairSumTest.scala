package com.ikempf.twopointers

import com.ikempf.twopointers.twoSum
import munit.FunSuite

class PairSumTest extends FunSuite:
  test("Pair sum should work") {
    assertEquals(twoSum(Vector(-5, -2, 3, 4, 6), 7), Some((2, 3)))
    assertEquals(twoSum(Vector.empty, 0), None)
    assertEquals(twoSum(Vector(1), 1), None)
    assertEquals(twoSum(Vector(2, 3), 5), Some((0, 1)))
    assertEquals(twoSum(Vector(2, 2, 3), 5), Some((0, 2)))
    assertEquals(twoSum(Vector(-1, 2, 3), 2), Some((0, 2)))
    assertEquals(twoSum(Vector(-3, -2, -1), -5), Some((0, 1)))
  }

  test("Pair sum (recursive) should work") {
    assertEquals(twoSumRec(Vector(-5, -2, 3, 4, 6), 7), Some((2, 3)))
    assertEquals(twoSumRec(Vector.empty, 0), None)
    assertEquals(twoSumRec(Vector(1), 1), None)
    assertEquals(twoSumRec(Vector(2, 3), 5), Some((0, 1)))
    assertEquals(twoSumRec(Vector(2, 2, 3), 5), Some((0, 2)))
    assertEquals(twoSumRec(Vector(-1, 2, 3), 2), Some((0, 2)))
    assertEquals(twoSumRec(Vector(-3, -2, -1), -5), Some((0, 1)))
  }
