package lectures.part01_basics

object StringOps extends App {

  // available through java environment
  val str: String = "Hello, I am learning Scala"
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.startsWith("Balls"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  // scala specific
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // scala string interpolators

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.219f
  val myth = f"$name%s can eat $speed%2.3f burgers per minute"
  val myth2 = f"$name can eat $speed burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(escaped)

  def rotateString(letters: String, n: Int) : String = {
    if (n > 0) {
      val end: Int = letters.length - 1;
      val lastCharacter: Char = letters.charAt(end);
      val newLetters = lastCharacter + letters.substring(0, end);
      rotateString(newLetters, n -1);
    }
    else letters;
  }

  val letters = "Rubber Baby Buggy Bumpers";
  val bob = rotateString(letters, 5);
  println(bob);
}
