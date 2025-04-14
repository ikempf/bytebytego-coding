package com.ikempf.twopointers

import com.ikempf.twopointers.tripletSum
import munit.FunSuite

class TripletSumTest extends FunSuite:
  test("Triplet sum should work") {
    assertEquals(tripletSum(Vector(0, -1, 2, -3, 1)), Set((-3, 1, 2), (-1, 0, 1)))
  }
