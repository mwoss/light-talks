package scopes

import kotlin.random.Random

// Context - it, return value - context object or null
// Like Collection.filter but on every object

fun main() {
    val number = Random.nextInt(100)

    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")


    val numbers = (1..5).map { it * Random.nextInt(0, 10) }
    numbers.takeIf { it.average() > 5 }?.let {
        println("Good roll :3")
    }
}
