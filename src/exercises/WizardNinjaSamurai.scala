package exercises

object WizardNinjaSamurai extends App {

  val bob = new Ninja("Bob")
  val frank = new Ninja("Frank")
  println("bobs stats")
  bob.showStats
  frank.punch(bob).showStats
  println("franks stats")
  frank.showStats
  bob.kick(frank).showStats

  val sensei = new Sensei("Tyrion")
  sensei.speakWisdom
}

class Ninja(val name: String, protected val health: Int = 100, speed: Int = 3, strength: Int = 3) {
  def sayName: Unit = println(name)

  def showStats: Unit = println(s"Health: ${health} | Speed: ${speed} | Strength: ${strength}")

  def drinkSake: Ninja = new Ninja(name, health + 10)

  def punch(target: Ninja): Ninja = {
    println(s"${this.name} punched ${target.name}")
    new Ninja(target.name, target.health - strength)
  }

  def kick(target: Ninja): Ninja = {
    println(s"${this.name} kicked ${target.name}")
    new Ninja(target.name, target.health - strength * 15)
  }
}

class Sensei(name: String) extends Ninja(name, health = 200, speed = 10, strength = 10) {
  val wisdom = 10
  def speakWisdom:Unit =
    super.drinkSake
    println(s"Confoocious say... man standing on toilet high on pot...")
}



