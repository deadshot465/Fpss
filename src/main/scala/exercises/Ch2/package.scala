package exercises

import scala.annotation.tailrec

package object Ch2:
  def fib(n: Int): Int =
    goFib(0, 1, n)

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
    goIsSorted(as, gt)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))

  @tailrec
  private def goFib(pp: Int, p: Int, n: Int): Int =
    if n == 0 then pp
    else goFib(pp + p, pp, n - 1)

  @tailrec
  private def goIsSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
    if as.length == 1 then true
    else if gt(as(1), as(0)) then goIsSorted(as.tail, gt) else false