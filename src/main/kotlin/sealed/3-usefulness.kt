package sealed

// Sealed classes are designed to be used when there are a very specific set of possible options for a value,
// and where each of these options is functionally different

// They forbid developers from creating new subclasses,
// thus create "exhaustive" environments where we know each branch will be processed/validated

sealed class Optional<out V> {
    abstract fun isPresent(): Boolean

    data class Some<out V>(val value: V) : Optional<V>() {
        override fun isPresent(): Boolean = true
    }

    class None<out V> : Optional<V>() {
        override fun isPresent(): Boolean = false
    }
}

fun main() {
    val maybeValue = Optional.Some(5)
}

