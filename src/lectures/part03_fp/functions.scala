package lectures.part03_fp

object functions extends App {

  // DREAM: use functions as first class elements
  // Problem: oop world

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function types = Function1[A, B]
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)


}

trait MyFunction[A, B] {
  def apply(element: A): B = ???
}
