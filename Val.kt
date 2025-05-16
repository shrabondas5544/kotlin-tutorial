
val name = "Shrabon"
var greeting: String? ="Hi"
var greetings: String? = null //"string?" for null type

fun main() {
    println(greeting)
    println(name)
    println("---------------------")

    greeting = "Hi"
    println(greeting)
    println(name)

    println("----------------------")
    greeting = null
    println(greeting)
    println(name)

    println("---------if statement-------------")
    if (greetings != null) {
        println(greetings)
    }
    println(name)

    println("----------------------")
    greeting = "hello"
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)

    println("----------when statement------------")
    when (greeting) {
        null -> println("Hello")  // in line num 16 we set greeting = null.
        else -> println(greeting)
    }
    println(name)

    println("----------------------")
    val greetingToPoint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPoint)
    println(name)
}
