package lectures.part02_oop

object MethodNotations extends App {
  /*
  Exercises:

  1.  Overload the + operator (string) => new person "Mary (string)"
  2.  Add an age to the Person class
      Add unary + operator => new person with the age + 1
  3.  Add a "learns" method in the Person class (string) => Mary learns 'string'
      Add a learnsScala method, calls learns method with "Scala". use postfix notation.
  4.  Overload the apply method
      mary.apply(2) => "Mary watched Inception 2 times"
   */

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangoutWith(person: Person): String = s"${this name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this name} is hanging out with ${person.name}"
    def +(nickName: String): Person = new Person(s"${this name} ($nickName)", this favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def unary_! : String = "Kawabunga!!"
    def isAlive: Boolean = true
    def apply(): String = s"Hola bitcholas, yo soy $name y me amo $favoriteMovie"
    def apply(n: Int): String = s"$name has watched $favoriteMovie $n times"
    def learns(knowledge: String): String = s"$name learns $knowledge"
    def learnsScala: String = this learns("Scala")
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println((mary + "The Rock Star")())
  println((+mary).age)
  println(mary learns "functional programming")
  println(mary learnsScala)
  println(mary(2))
  println((mary + "The Rock Star")(10))

  // infix notation = operator notation ... requires single argument method
  println(mary likes "Inception") // syntactic sugar

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangoutWith tom)
  println(mary + tom)

  println(1 + 2)
  println(1.+(2))

  // All operators are methods!
  // Akka actors have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_-

  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive) // must have no parameters

  // apply
  println(mary.apply())
  println(mary()) // equivalent

}
