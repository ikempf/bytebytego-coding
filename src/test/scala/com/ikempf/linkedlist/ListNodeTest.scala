package com.ikempf.linkedlist

import munit.FunSuite

class ListNodeTest extends FunSuite {

  test("Length (rec) should compute list length") {
    // Given
    val list = ListNode(1, 2, 3, 4, 5)

    // When
    val result = lengthRec(list)

    // Then
    assertEquals(result, 5)
  }

  test("Length (mut) should compute list length") {
    // Given
    val list = ListNode(1, 2, 3, 4, 5)

    // When
    val result = lengthMut(list)

    // Then
    assertEquals(result, 5)
  }
  
}
