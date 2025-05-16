

fun sayHelloo(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun sayHello(itemToGreet:String) = println("hello $itemToGreet")
//or
//fun sayHello(itemToGreet:String) {
//    val msg = "hello $itemToGreet" //Or "hello " + itemToGreet
//    println(msg)
//}

fun main() {
    sayHello( itemToGreet = "kotlin")
    sayHello(itemToGreet = "World")
    sayHelloo(greeting = "hello" , itemToGreet = "kotlin")
    sayHelloo(greeting = "Hey" , itemToGreet = "World")
}

