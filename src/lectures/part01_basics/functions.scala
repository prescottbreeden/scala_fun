package lectures.part01_basics

object functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("idiots", 88))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("rubber baby buggy bumpers -- ", 3))

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*

    Challenges

  1. A greeting function for kids (name, age) => "Hi, my name is $name and I am $age years old"
  2. Factorial function
  3. Fibonacci function
  4. Tests if a number is prime.

   */

  def greeting(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old"

  def rFactorial(num: Int): Int =
    if (num <= 1) 1
    else num * rFactorial(num-1)

  println(rFactorial(num = 5))

  def rFib(num: Int): Int =
    if (num <= 2) 1
    else rFib(num-1) + rFib(num-2)

  println(rFib(num = 8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(38 * 39))
}
