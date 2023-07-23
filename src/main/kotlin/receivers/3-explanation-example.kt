package receivers

val sum: Int.(Int) -> Int = { other -> plus(other) }

fun Int.sum(x: Int) = plus(x)

fun main() {
    println(2.sum(1))

    listOf(1,2,3).map { sum(it, 50)}
    listOf(1,2,3).map { it.sum(50)}
}

