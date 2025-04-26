package com.ikempf.linkedlist

enum ListNode[+A]:
  case Cons(value: A, next: ListNode[A])
  case Empty

object ListNode:
  def apply[A](value: A*): ListNode[A] =
    value.foldRight(Empty)((a, acc) => Cons(a, acc))
