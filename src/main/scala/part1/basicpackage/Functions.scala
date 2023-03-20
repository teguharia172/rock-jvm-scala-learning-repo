package part1.basicpackage

object Functions extends App{

  def aFunction (a: String, b: Int) : String = {
    a + " " + b
  } // return type do not need to be specify for non recursive function
  // for best practice always specify the return type of a function

  println(aFunction("hello", 3))

  def aParameterlessFuction(): Int = 42
  println(aParameterlessFuction())
  //  println(aParameterlessFuction) this method will work with scala 2 however with scala 3
  //  you will still need the parentheses of when calling a parameterless function

  def aRepeatedFunction(aString : String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a : Int, b: Int) : Int = a + b

    aSmallerFunction(n,n-1)
  }
  println(aBigFunction(5))
}
