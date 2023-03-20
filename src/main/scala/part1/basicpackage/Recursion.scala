package part1.basicpackage

import scala.annotation.tailrec

object Recursion extends  App{

    def factorial(n: Int) : Int =
      if( n <= 1) 1
      else {
        println("computing factorial of " + n + " - I need factorial of " + (n-1))
        val result = n * factorial(n-1)
        println("Computed factorial of " + n)

        result
      }

    println(factorial(5))

    def anotherFactorial(n: Int) : BigInt = {
      @tailrec
      def factorialHelper(x: Int, accumulator: Int): BigInt =
        if (x <= 1) accumulator
        else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the last expression

      factorialHelper(n, 1)
    }

    println(anotherFactorial(19))
    /*
      anotherFactorial(10) = factHelper(10,1)\
      = factHelper(9, 10 * 1)
      = factHelper(8,9 * 10 * 1)
      = factHelper(7, 8 * 9 * 10 * 1)
    */
    // WHEN YOU NEED LOOPS, Use _TAIL_RECURSION
}
