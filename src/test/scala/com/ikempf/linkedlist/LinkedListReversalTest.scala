package com.ikempf.linkedlist

import munit.FunSuite

class LinkedListReversalTest extends FunSuite {

  test("Reversal should work") {
    // Given
    val list = ListNode(1, 2, 3, 4, 5, 6)

    // When
    val reversed = reverseRec(list)

    // Then
    assertEquals(reversed, ListNode(6, 5, 4, 3, 2, 1))
  }

  test("Reversal should work for mutable lists (recursive)") {
    // Given
    val list = ListNodeM(1, ListNodeM(2, ListNodeM(3, null)))

    // When
    val reversed = reverseRecMut(list)

    // Then
    assertEquals(reversed.value, 3)
    assertEquals(reversed.next.value, 2)
    assertEquals(reversed.next.next.value, 1)
    assertEquals(reversed.next.next.next, null)
  }

  test("Reversal should work for mutable lists") {
    // Given
    val list = ListNodeM(1, ListNodeM(2, ListNodeM(3, null)))

    // When
    val reversed = reverseMut(list)

    // Then
    assertEquals(reversed.value, 3)
    assertEquals(reversed.next.value, 2)
    assertEquals(reversed.next.next.value, 1)
    assertEquals(reversed.next.next.next, null)
  }

}
