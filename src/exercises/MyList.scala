package exercises

/*
  head = first element of the list
  tail = remainder of the list
  isEmpty = is this list empty
  add(int) => new list with this element added
  toString => a string representation of the list
 */

object MyListTest extends App {

  val sll = new LinkedList()
  val sll2 = sll.addFront(1)
  val sll3 = sll2.addFront(2)
  val sll4 = sll3.addFront(3)
  println(sll4.head)
  println(sll4.tail)

}

abstract class Node {
  val value: Int
  val next: Node
  override def toString: String
}

class SLLNode(val value: Int, val next: Node = null) extends Node {
  override def toString: String = s"Node: $value | Next => $next"
}

abstract class SLL {
  def head: Node
  def tail: Node
  def isEmpty: Boolean
}

class LinkedList(h: Node = null, t: Node = null) extends SLL {
  def head: Node = h
  def tail: Node = t
  def isEmpty: Boolean = head == null
  def addFront(element: Int): LinkedList =
    if (isEmpty) {
      val newNode = new SLLNode(element)
      new LinkedList(newNode, newNode)
    }
    else {
      val newNode = new SLLNode(element, head)
      new LinkedList(newNode, tail)
    }
}

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  override def toString: String
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element, Empty)
  override def toString: String = "Rubber Baby Buggy Bumpers"

}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element, this)
  override def toString: String = "Rubber Baby Buggy Bumpers"
}




