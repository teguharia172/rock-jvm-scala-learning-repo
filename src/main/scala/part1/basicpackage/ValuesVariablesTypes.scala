package part1.basicpackage

object ValuesVariablesTypes extends App{

    val x: Int = 42
    println(x)

    // VALS ARE IMMUTABLE
    // TYPES of Vals Are Optional
    // Compiler can infer types

    val aString: String = "Hello"
    val anotherString = "Goodbye"

    val aBoolean: Boolean = false
    val aChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 4613
    val aLong: Long = 523873429873249874L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14

    //variables
    var aVariable: Int = 4

    aVariable = 5

    // Key takeaways :

    // 1.var are mutable while val is not
    // 2.vals are more preferable compared to vars
    // 3.all vals and vars have types
    
}
