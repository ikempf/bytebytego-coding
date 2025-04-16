package com.ikempf.setmaps

import munit.FunSuite

class PairSumUnsortedTest extends FunSuite {

  test("IsPairSumUnsorted should work") {
    assertEquals(pairSum(Vector(-1, 3, 4, 2), 3), Some((0, 2)))
    assertEquals(pairSum(Vector(-5, -2, 3, 4, 6), 7), Some((2, 3)))
    assertEquals(pairSum(Vector(), 0), None)
    assertEquals(pairSum(Vector(1), 1), None)
    assertEquals(pairSum(Vector(2, 3), 5), Some((0, 1)))
    assertEquals(pairSum(Vector(2, 2, 3), 5), Some((1, 2)))
    assertEquals(pairSum(Vector(-1, 2, 3), 2), Some((0, 2)))
    assertEquals(pairSum(Vector(-3, -2, -1), -5), Some((0, 1)))
    assertEquals(pairSum(Vector(1, 2, 2, 4), 4), Some((1, 2)))
  }

}
