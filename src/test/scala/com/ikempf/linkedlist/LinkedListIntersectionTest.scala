package com.ikempf.linkedlist

import munit.FunSuite

class LinkedListIntersectionTest extends FunSuite {

  test("List intersection should work when lists are identical") {
    // Given
    val first = ListNodeM(5, ListNodeM(3, ListNodeM(1, null)))
    val second = first

    // When
    val result = intersection(first, second)

    assertEquals(result, first)
  }

  test("List intersection should return null when no intersection exists") {
    // Given
    val first = ListNodeM(5, ListNodeM(3, ListNodeM(1, null)))
    val second = ListNodeM(5, ListNodeM(3, ListNodeM(1, null)))

    // When
    val result = intersection(first, second)

    assertEquals(result, null)
  }

  test("List intersection should return intersection when lists have the same length") {
    // Given
    val intersect = ListNodeM(3, ListNodeM(1, null))
    val first = ListNodeM(5, intersect)
    val second = ListNodeM(5, intersect)

    // When
    val result = intersection(first, second)

    assertEquals(result, intersect)
  }

  test("List intersection should return intersection when lists different lengths") {
    // Given
    val intersect = ListNodeM(3, ListNodeM(1, null))
    val first = ListNodeM(1, ListNodeM(2, ListNodeM(3, intersect)))
    val second = ListNodeM(5, intersect)

    // When
    val result = intersection(first, second)

    assertEquals(result, intersect)
  }

}
