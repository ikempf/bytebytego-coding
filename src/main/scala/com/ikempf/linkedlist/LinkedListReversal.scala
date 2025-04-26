package com.ikempf.linkedlist

import com.ikempf.linkedlist.ListNode.{Cons, Empty}

import scala.annotation.tailrec

def reverseRec[A](list: ListNode[A]): ListNode[A] =
  reverseRec(list, Empty)

@tailrec
private def reverseRec[A](list: ListNode[A], prev: ListNode[A]): ListNode[A] =
  list match
    case Cons(value, next) => reverseRec(next, Cons(value, prev))
    case Empty             => prev

// Mutable version
class ListNodeM[A](val value: A, var next: ListNodeM[A])

def reverseRecMut[A](list: ListNodeM[A]): ListNodeM[A] = reverseRec(list, null)

@tailrec
private def reverseRec[A](list: ListNodeM[A], prev: ListNodeM[A]): ListNodeM[A] =
  if list.next == null then
    list.next = prev
    list
  else
    val currentNext = list.next
    list.next = prev
    reverseRec(currentNext, list)

private def reverseMut[A](list: ListNodeM[A]): ListNodeM[A] =
  var prev: ListNodeM[A] = null
  var curr: ListNodeM[A] = list
  while curr != null do
    val next = curr.next
    curr.next = prev
    prev = curr
    curr = next

  prev
