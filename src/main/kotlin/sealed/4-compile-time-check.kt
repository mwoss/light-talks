package sealed

import kotlin.random.Random

sealed class Result<out R> {
    data class Ok<out T>(val value: T) : Result<T>()
    data class Maybe<out T>(val value: T?): Result<T>()
    data class Error(val cause: String?) : Result<Nothing>()
}

fun performIOOperation(): Result<String> {
    return if (Random.nextInt() % 2 == 0) Result.Ok(":33") else Result.Error("Upsi")
}

fun main() {
    // ...
    val processed = when(performIOOperation()) {
        is Result.Ok -> "Process information and perform next steps"
        is Result.Error -> TODO()
        else -> TODO()
    }
    // ...
}

