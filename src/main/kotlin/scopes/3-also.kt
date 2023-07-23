package scopes

import kotlin.random.Random

// Context - it, return value - context object

fun alsoDoThisCoolThingInBetween() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val selectedNumbers = numbers
        .map { it * Random.nextInt(5, 10) }
        .also { println("Numbers after multiplication with random number: $it") }
        .filter { it > 13 }
        .also { println(it) }
        .average()
        .also { println(it) }

    println(selectedNumbers)
}

fun main() {
    alsoDoThisCoolThingInBetween()
}
