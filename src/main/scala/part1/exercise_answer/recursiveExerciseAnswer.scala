package exercise

import java.io.StringBufferInputStream
import scala.annotation.tailrec
import scala.jdk.Accumulator

object recursiveExerciseAnswer extends App {

  // 1. Concatenating string n times

  @tailrec
  def concatString(stringInput: String ,n : Int, accumulator : String) : String =
    if (n <= 0) accumulator
    else concatString(stringInput, n-1, stringInput + accumulator)

  println(concatString("hello", 2, " "))

  // 2. Prime Number
  def primeRecursive(n: Int) : Boolean = {
    @tailrec
    def isPrimeTailRec(x: Int, isStillPrime: Boolean) : Boolean =
      if (!isStillPrime) false
      else if (x <= 1) true
      else isPrimeTailRec(x - 1, n % x != 0 && isStillPrime)

    isPrimeTailRec(n/2 , true)
  }
  println(primeRecursive(2003))

  // fibonacci number

  def fibonacci(n: Int) : Int = {
    @tailrec
    def fibonacciRecursive(i: Int, last: Int, nextToLast : Int) : Int =
      if(i >= n) last
      else fibonacciRecursive(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciRecursive(2, 1, 1)
  }
  println(fibonacci(5)) // 1 1 2 3 5 8
}
