package com.ikempf.linkedlist

import scala.annotation.tailrec

case class ListNode[A](value: A, next: Option[ListNode[A]])
object ListNode:
  def apply[A](value: A, next: ListNode[A]): ListNode[A] =
    ListNode(value, Some(next))

def reverseRec[A](list: ListNode[A]): ListNode[A] = reverseRec(list, None)

@tailrec
private def reverseRec[A](list: ListNode[A], prev: Option[ListNode[A]]): ListNode[A] =
  val l = ListNode(list.value, prev)
  if list.next.isDefined then reverseRec(list.next.get, Some(l))
  else ListNode(list.value, prev)

// Mutable version
class ListNodeM[A](val value: A, var next: ListNodeM[A])

def reverseRec[A](list: ListNodeM[A]): ListNodeM[A] = reverseRec(list, null)

@tailrec
private def reverseRec[A](list: ListNodeM[A], prev: ListNodeM[A]): ListNodeM[A] =
  if list.next == null then
    list.next = prev
    list
  else
    val currentNext = list.next
    list.next = prev
    reverseRec(currentNext, list)

private def reverse2[A](list: ListNodeM[A], prev: ListNodeM[A]): ListNodeM[A] =
  ???
