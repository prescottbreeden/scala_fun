package lectures.part01_basics

import scala.annotation.tailrec

object recurssion extends App {


  def factorial(n: Int):Int =
    if (n <=1 ) 1
    else {
      println("Computing factorial of " + n + " _ I first need facotiral of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

//  println(factorial(10))


  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x < 1) accumulator
      else factHelper(x-1, x * accumulator)

    factHelper(n, accumulator = 1)
  }

//  println(anotherFactorial(5000))

  /*

  1. Concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive

   */

  def concat(str: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concat(str, n-1, accumulator + str)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(i: Int): Boolean =
      if (i <= 1) true
      else n % i != 0 && isPrimeUntil(i-1)

    isPrimeUntil(n / 2)
  }

  def isPrime2(n: Int): Boolean = {
    def isPrimeTailRec(i: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (i <= 1) true
      else isPrimeTailRec(i-1, n % i != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  def fib(num: Int): BigInt = {
    def fibHelper(i: Int, last: BigInt, nextToLast: BigInt): BigInt =
      if (i >= num) last
      else fibHelper(i + 1, last + nextToLast, last)

    if (num <= 2) 1
    else fibHelper(2, 1, 1)
  }


  def isPalindrome(str: String): Boolean = {
    val lower: String = str.toLowerCase()
    val noSpaces: String = lower.replace(" ", "")

    def palHelper(start: Int, end: Int): Boolean = {
      if (end <= start) return true
      if (noSpaces.charAt(start) != noSpaces.charAt(end)) return false
      palHelper(start + 1, end - 1)
    }

    palHelper(0, noSpaces.length()-1)
  }


  println(concat(str = "rubberbabybuggybumpers", n = 5, accumulator = ""))
//  println(fib(1000))

  val anneMichaels: String = "Are we not drawn onward to new era"
  val napoleon: String = "Able was I ere I saw Elba"
  println(isPalindrome("taco cat"))
  println(isPalindrome(anneMichaels))
  println(isPalindrome(napoleon))
}
