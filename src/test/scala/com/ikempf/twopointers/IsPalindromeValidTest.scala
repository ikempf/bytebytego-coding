package com.ikempf.twopointers

import munit.FunSuite

class IsPalindromeValidTest extends FunSuite {

  test("IsPalindromeEasy should work") {
    assertEquals(isPalindromeEasy("a dog! a panic in a pagoda."), true)
    assertEquals(isPalindromeEasy(""), true)
    assertEquals(isPalindromeEasy("a"), true)
    assertEquals(isPalindromeEasy("aa"), true)
    assertEquals(isPalindromeEasy("ab"), false)
    assertEquals(isPalindromeEasy("|, (?)"), true)
    assertEquals(isPalindromeEasy("12.02.2021"), true)
    assertEquals(isPalindromeEasy("21.02.2021"), false)
    assertEquals(isPalindromeEasy("hello, world!"), false)
  }

  test("IsPalindrome should work") {
    assertEquals(isPalindrome("a dog! a panic in a pagoda."), true)
    assertEquals(isPalindrome(""), true)
    assertEquals(isPalindrome("a"), true)
    assertEquals(isPalindrome("aa"), true)
    assertEquals(isPalindrome("ab"), false)
    assertEquals(isPalindrome("|, (?)"), true)
    assertEquals(isPalindrome("12.02.2021"), true)
    assertEquals(isPalindrome("21.02.2021"), false)
    assertEquals(isPalindrome("hello, world!"), false)
  }

  test("IsPalindromeMemoryOptimized should work") {
    assertEquals(isPalindromeMemoryOptimized("a dog! a panic in a pagoda."), true)
    assertEquals(isPalindromeMemoryOptimized(""), true)
    assertEquals(isPalindromeMemoryOptimized("a"), true)
    assertEquals(isPalindromeMemoryOptimized("aa"), true)
    assertEquals(isPalindromeMemoryOptimized("ab"), false)
    assertEquals(isPalindromeMemoryOptimized("|, (?)"), true)
    assertEquals(isPalindromeMemoryOptimized("12.02.2021"), true)
    assertEquals(isPalindromeMemoryOptimized("21.02.2021"), false)
    assertEquals(isPalindromeMemoryOptimized("hello, world!"), false)
  }

}
