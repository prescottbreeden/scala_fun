package lectures.part02_oop

/*
Novel and a Writer

Writer: first name, surname, year
  - method fullName

Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel with new release year


Counter class
  - receives an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dec to receive an amount paramter

 */

object OO_Basics {

  val person = new Person("Bob Ross", 42)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet

  // assignments
  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter()
  counter.inc.print
  counter.inc(10).print
}


class Person(name: String, val age: Int) {
  // any code can execute during initialization
  println(1 + 3)

  // properties
  val x = 2

  // methods
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet: Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
}


class Writer(firstName: String, lastName: String, val age: Int) {
  def fullName: String = firstName + " " + lastName
}


class Novel(name: String, released: Int, author: Writer) {
  def authorAge: Int = released - author.age
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


class Counter(val count: Int = 0) {

  def inc: Counter = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }


  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print: Unit = println(count)

}
