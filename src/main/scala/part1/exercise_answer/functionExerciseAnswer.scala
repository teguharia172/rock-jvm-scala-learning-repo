package exercise

import scala.annotation.tailrec

object functionExerciseAnswer extends App{

  // Question 1 Kids Name :

  def kidsGreeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(kidsGreeting("Jonather", 12))

  //  Question 2 Factorial Function
  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }

  println(factorialFunction(n = 4))

  //  Fibonacci Function
  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(n = 5))

  // Prime Number
  
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(10))

}
