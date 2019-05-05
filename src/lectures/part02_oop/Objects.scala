package lectures.part02_oop

object Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("Bobby Tables")
  }

  // COMPANIONS = obj Person + class Person

  class Person(val name: String) {
    // instance-level functionality
  }

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
  def main(args: Array[String]): Unit = {

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val bob = new Person("Bob")
  println(mary == bob)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val kid = Person(mary, bob)

  }

}
