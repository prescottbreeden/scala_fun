package lectures.part02_oop

object Inheritance extends App {

  sealed class Animal {
    val creatureType = "Wild"
    protected def eat = println("nom nom nom")
  }

  class Cat extends Animal {
    override val creatureType: String = "Sorta Domestic"
    def sleep = println("I'm lazy")
  }

  class Dog extends Cat {
    override val creatureType: String = "Domestic"
    override def eat: Unit = println("slurp hack slurp hack, lick lick lick lick...")
    def crunch = {
      eat
      println("crunch crunch")
    }
    def mope = println("Where's mommy....")
  }

  val dog = new Dog
  dog.sleep
  dog.mope
  dog.crunch
  dog.eat
  println(dog.creatureType)

  val cat = new Cat
  println(cat.creatureType)

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  val bob = new Adult("Bob", 42, "12345")

  // type substitution (polymorphism-ish)
  val unknownAnimal: Animal = new Dog
  println(unknownAnimal.creatureType)

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class - extend classes in THIS FILE, prevent extensions in other classes

}
