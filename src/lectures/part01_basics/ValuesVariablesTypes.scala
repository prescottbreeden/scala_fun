package lectures.part01_basics

object ValuesVariablesTypes extends App {

 val x = 42
 println(x)

 // values are immutable
 // compiler can infer types

 val aString: String = "Rubber Baby Buggy Bumpers..."
 val anotherString = "always declare variables on separate lines"

 val aBoolean: Boolean = false
 val aChar: Char = 'a'
 val anInt: Int = x
 val aShort: Short = 4242
 val aLong: Long = 9999999999999L
 val aFloat: Float = 2.0f
 val aDouble: Double = 3.14

 // variables in scala

 var aVariable: Int = 4
 aVariable = 5 // side effects

}
