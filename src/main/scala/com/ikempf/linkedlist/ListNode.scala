package com.ikempf.linkedlist

import com.ikempf.linkedlist.ListNode.{Cons, Empty}

import scala.annotation.tailrec

enum ListNode[+A]:
  case Cons(value: A, next: ListNode[A])
  case Empty

// Mutable version
class ListNodeM[A](val value: A, var next: ListNodeM[A])

object ListNode:
  def apply[A](value: A*): ListNode[A] =
    value.foldRight(Empty)((a, acc) => Cons(a, acc))

def lengthMut(list: ListNode[?]): Int =
  lengthMut(list, 0)

private def lengthMut(list: ListNode[?], l: Int): Int =
  var cpt = 0
  var next = goNext(list)

  while next != null do
    cpt = cpt + 1
    next = goNext(next)

  cpt

private def goNext(list: ListNode[?]) =
  list match
    case Cons(value, next) => next
    case ListNode.Empty    => null

def lengthRec(list: ListNode[?]): Int =
  lengthRec(list, 0)

@tailrec
private def lengthRec(list: ListNode[?], l: Int): Int =
  list match
    case Cons(value, next) => lengthRec(next, l + 1)
    case Empty             => l

def lengthRec(list: ListNodeM[?]): Int =
  lengthRec(list, 0)

@tailrec
private def lengthRec(list: ListNodeM[?], l: Int): Int =
  if list == null then l
  else lengthRec(list.next, l + 1)

extension [A](list: ListNode[A]) def length: Int = lengthRec(list)
extension [A](list: ListNodeM[A]) def length: Int = lengthRec(list)
