package com.ikempf.setmaps

import munit.FunSuite

class VerifySudokoTest extends FunSuite {

  test("VerifySudoku should work horizontally") {
    // Given
    val sudoku =
      Vector(
        Vector(3, 0, 6, 0, 5, 8, 4, 0, 0),
        Vector(5, 2, 0, 0, 0, 0, 0, 0, 0),
        Vector(0, 8, 7, 0, 0, 0, 0, 3, 1),
        Vector(1, 0, 2, 5, 0, 0, 3, 2, 0),
        Vector(9, 0, 0, 8, 6, 3, 0, 0, 5),
        Vector(0, 5, 0, 0, 9, 0, 6, 0, 0),
        Vector(0, 3, 0, 0, 0, 0, 2, 5, 0),
        Vector(0, 1, 0, 0, 0, 0, 0, 7, 4),
        Vector(0, 0, 5, 2, 0, 6, 0, 0, 0),
      )

    // When
    val result = verifyAxis(sudoku)

    // Then
    assertEquals(result, Result(false, Some("Column 4, number 2")))
  }

  test("VerifySudoku should work vertically") {
    // Given
    val sudoku =
      Vector(
        Vector(3, 0, 6, 0, 5, 8, 4, 0, 0),
        Vector(5, 2, 0, 0, 0, 0, 0, 0, 0),
        Vector(0, 8, 7, 0, 0, 0, 0, 3, 1),
        Vector(1, 0, 0, 5, 0, 0, 3, 2, 0),
        Vector(9, 0, 0, 8, 6, 3, 0, 0, 5),
        Vector(0, 5, 0, 0, 9, 0, 6, 0, 0),
        Vector(0, 3, 0, 0, 0, 8, 2, 5, 0),
        Vector(0, 1, 0, 0, 0, 0, 0, 7, 4),
        Vector(0, 0, 5, 2, 0, 6, 0, 0, 0),
      )

    // When
    val result = verifyAxis(sudoku)

    // Then
    assertEquals(result, Result(false, Some("Line 6, number 8")))
  }

  test("VerifySudoku should work by 3x3 cell") {
    // Given
    val sudoku =
      Vector(
        Vector(3, 0, 6, 0, 5, 8, 4, 0, 0),
        Vector(5, 2, 0, 0, 0, 0, 0, 0, 0),
        Vector(0, 8, 7, 0, 0, 0, 0, 3, 1),
        Vector(1, 0, 0, 5, 0, 0, 3, 2, 0),
        Vector(9, 0, 0, 8, 6, 3, 0, 0, 5),
        Vector(0, 5, 0, 0, 9, 0, 6, 0, 0),
        Vector(0, 3, 0, 6, 0, 0, 2, 5, 0),
        Vector(0, 1, 0, 0, 0, 0, 0, 7, 4),
        Vector(0, 0, 5, 2, 0, 6, 0, 0, 0),
      )

    // When
    val result = verifyAxis(sudoku)

    // Then
    assertEquals(result, Result(false, Some("Cell 8, number 6")))
  }

}
