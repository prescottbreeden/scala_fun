package lectures.part02_oop

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Pomeranian"
    override def eat: Unit = "nom nom nom"
  }

  // traits -- i.e. Interface

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded {
    val bloodType: String = "Cold"
  }


  class Crocodile(val name: String) extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"
    override def eat: Unit = "nom nom nom"

    override def eat(animal: Animal): Unit = println(s"${name} ate a ${animal.creatureType}")
  }

  val bob = new Crocodile("Bob")
  bob.eat(new Dog)
  println(bob.bloodType)
}
