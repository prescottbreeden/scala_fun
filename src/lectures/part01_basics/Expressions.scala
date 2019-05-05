package lectures.part01_basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3  // also works with -= *= /= ...... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  // Loop --- but yea don't
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything in Scala is an Expression

  val aWeirdValue = aVariable = 3 // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)


  // 1. what is the difference between "hello world" and println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)
}
