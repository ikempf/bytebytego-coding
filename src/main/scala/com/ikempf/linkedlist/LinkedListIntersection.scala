package com.ikempf.linkedlist

import scala.annotation.tailrec

def intersection[A](listA: ListNodeM[A], listB: ListNodeM[A]): ListNodeM[A] = {
  var first = listA
  var second = listB

  Range(0, listA.length - listB.length).foreach { _ => first = first.next }
  Range(0, listB.length - listA.length).foreach { _ => second = second.next }

  intersection_(first, second)
}

@tailrec
private def intersection_[A](listA: ListNodeM[A], listB: ListNodeM[A]): ListNodeM[A] =
  if listA == null || listB == null then null
  else if listA == listB then listA
  else intersection_(listA.next, listB.next)
