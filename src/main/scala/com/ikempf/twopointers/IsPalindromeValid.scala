package com.ikempf.twopointers


def isPalindromeEasy(value: String): Boolean = {
  val sanitized = value.filter(_.isLetterOrDigit)
  sanitized == sanitized.reverse
}

def isPalindrome(value: String): Boolean = {
  val sanitized = value.filter(_.isLetterOrDigit)
  var left = 0
  var right = sanitized.length - 1

  while left < right && sanitized(left) == sanitized(right) do
    left = left + 1
    right = right - 1

  left >= right
}

def isPalindromeMemoryOptimized(value: String): Boolean = {
  var left = 0
  var right = value.length - 1

  while left < right do
    while left < right && !value(left).isLetterOrDigit do
      left = left + 1

    while left < right && !value(right).isLetterOrDigit do
      right = right - 1

    if value(left) == value(right) then
      left = left + 1
      right = right - 1
    else return false

  true
}
