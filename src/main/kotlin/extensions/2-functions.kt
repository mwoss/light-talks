package extensions

import kotlin.math.pow
import kotlin.random.Random

fun String.prettify(): String {
    return "$this :33"
}

fun String.countLetters(): Map<Char, Int> {
    return this.groupingBy { it }.eachCount()
}

fun <T> List<T>.getRandomElement(): T {
    return this[Random.nextInt(this.size)]
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return this.toString()
}

infix fun Number.toPowerOf(exp: Number): Number {
    return this.toDouble().pow(exp.toDouble())
}

operator fun String.times(by: Int): String {
    return this.repeat(by)
}

class ExtensionTest {
    companion object {}
}

fun ExtensionTest.Companion.canIDoItToo(): String {
    return "Yes :3"
}

fun main() {
    println("LOOL".prettify())
    println("Ala ma kota, kot ma Ale".countLetters())

    println(listOf(1,2,3,4,5).getRandomElement())
    println(listOf("a", "b").getRandomElement())

    println(2 toPowerOf 10)

    println("XD" * 10)

    println(ExtensionTest.Companion.canIDoItToo())
}
