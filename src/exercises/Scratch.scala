package exercises

object Scratch extends App {

  def greeting(name: String): String =
    if (name == "yiling") s"Sup, ${name.capitalize}"
    else if (name == "prescott") s"Wake up ${name.capitalize} you're running in circles"
    else s"Who the fuck are you, ${name.capitalize}"

  def printThing(func: String): Unit = println(func)

  printThing(greeting("yiling"))
  printThing(greeting("prescott"))
  printThing(greeting("nugget"))
}
