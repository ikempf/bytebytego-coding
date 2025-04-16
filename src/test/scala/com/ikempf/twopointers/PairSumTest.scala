package com.ikempf.twopointers

import com.ikempf.twopointers.pairSum
import munit.FunSuite

class PairSumTest extends FunSuite:
  test("Pair sum should work") {
    assertEquals(pairSum(Vector(-5, -2, 3, 4, 6), 7), Some((2, 3)))
    assertEquals(pairSum(Vector(), 0), None)
    assertEquals(pairSum(Vector(1), 1), None)
    assertEquals(pairSum(Vector(2, 3), 5), Some((0, 1)))
    assertEquals(pairSum(Vector(2, 2, 3), 5), Some((0, 2)))
    assertEquals(pairSum(Vector(-1, 2, 3), 2), Some((0, 2)))
    assertEquals(pairSum(Vector(-3, -2, -1), -5), Some((0, 1)))
  }

  test("Pair sum (recursive) should work") {
    assertEquals(pairSumRec(Vector(-5, -2, 3, 4, 6), 7), Some((2, 3)))
    assertEquals(pairSumRec(Vector(), 0), None)
    assertEquals(pairSumRec(Vector(1), 1), None)
    assertEquals(pairSumRec(Vector(2, 3), 5), Some((0, 1)))
    assertEquals(pairSumRec(Vector(2, 2, 3), 5), Some((0, 2)))
    assertEquals(pairSumRec(Vector(-1, 2, 3), 2), Some((0, 2)))
    assertEquals(pairSumRec(Vector(-3, -2, -1), -5), Some((0, 1)))
  }
