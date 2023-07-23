package receivers

import kotlin.math.pow
import kotlin.random.Random


// Functions are first class citizens in Kotlin

fun printSomething() = println(Random.nextInt())

val powerOf: (Int, Int) -> Int = { num, exp -> num.toDouble().pow(exp).toInt() }


// Higher order function is a function that can accept function(s) as arguments and/or return function

val doubledNumb = listOf(1, 2, 3, 4, 5).map { it * 2 }


// Function types are used to denote we are dealing with functions

val onSubmit: () -> Unit = TODO()
val isEven: (Int) -> Boolean = TODO()
val soFunctionalWow: (Int, Int?) -> ((Int) -> Unit) = TODO()


// Function literals are functions that are not declared but are passed immediately as an expression.

val sortedNums1 = listOf("aa", "b", "bbb", "c", "aaaaa").sortedBy { it.length }
val sortedNums2 = listOf("aa", "b", "bbb", "c", "aaaaa").sortedBy(fun(s: String) = s.length)


// Receiver - entity on which we can call properties/functions etc. in given block of code without qualifying it

fun String.countLetters(): Map<Char, Int> = groupingBy { it }.eachCount()
