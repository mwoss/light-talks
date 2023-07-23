package scopes

// Context - it, return value - lambda result

fun letDoSomething() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val x = numbers.map { it * it }.filter { it > 3 }.let {
        it.average()
        println(it)
    }

    val someWeirdNumber = numbers.random().let { number ->
        if (number >=3) number xor number else number * 5 - 1
    }
    println(someWeirdNumber)

    val charactersCount = StringBuilder().let {
        it.append("LOOOOOOL")
        it.append("XDDDDDDD")
        it.length
    }
    println(charactersCount)
}

fun letOnNullableProperties() {
    val firstMessage: String? = "LOOL XD"
    firstMessage?.let {
        println(it)
    }

    val secondMessage: String? = null
    secondMessage?.let {
        println(it)
    }
}

fun main() {
//     letDoSomething()
     letOnNullableProperties()
}
