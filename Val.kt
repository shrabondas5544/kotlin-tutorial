
val name: String ="Shrabon"
var greeting: String? ="hello world" //"string?" for null type

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
}