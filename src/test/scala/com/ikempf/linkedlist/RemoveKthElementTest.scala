package com.ikempf.linkedlist

import munit.FunSuite

class RemoveKthElementTest extends FunSuite {

  test("RemoveKthElement should work") {
    // Given
    val list = ListNode(1, 2, 3, 4, 5, 6)

    // When
    val result = removeKthElement(list, 3)

    // Then
    assertEquals(result, ListNode(1, 2, 3, 5, 6))
  }

}
