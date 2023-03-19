package part1.basicpackage

object Expressions extends App {

  val x = 1 + 2 // EXPRSSION
  println(x)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .. side effects
  println(aVariable)

  // Instructions (DO) vs Expression (VALUE)

  // IF expression

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF Expression not an IF Instructions
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks
  // 1. Code blocks is an expression
  // 2. Code blocks can have it's own definition and it's only visible inside the code block

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //  Lesson Takeaways
  // 1. Basic expressions : operators
  // 2. if in Scala is an expression
  // 3. Code blocks in Scala are expressions
  //  3.1 the value of the block is the value of it's last expression
  // 4. Expression vs instructions
  //  4.1 instructions are executed (think Java), expression are evaluated (Scala)

  // Exercise
  // 1. difference between "hello world" vs println("hello world") ?
  // 2. what are the values of the code block below
  //  2.1 true
  //  2.2 int (code block value is it's last expression )

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
}
