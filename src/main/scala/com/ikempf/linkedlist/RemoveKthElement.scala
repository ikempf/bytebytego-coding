package com.ikempf.linkedlist

import com.ikempf.linkedlist.ListNode.{Cons, Empty}

def removeKthElement[A](list: ListNode[A], k: Int): ListNode[A] =
  val positionFromStart = list.length - k

  def until(l: ListNode[A], cpt: Int): ListNode[A] =
    if cpt == positionFromStart then
      l match
        case Cons(value, Cons(v, n)) => Cons(v, n)
        case Cons(_, Empty) | Empty  => Empty
    else
      l match
        case Cons(value, next) => Cons(value, until(next, cpt + 1))
        case Empty             => Empty

  until(list, 0)
