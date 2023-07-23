package sealed

enum class Operation1 {
    Add,
    Sub,
    Div,
    Mul
}

sealed class Operation2 {
    object Add
    object Sub
    object Div
    object Mul
}


sealed class Operation3 {
    data class Add(val a: Number, val b: Number): Operation3()
    data class Sub(val a: Number, val b: Number): Operation3()
    data class Div(val a: Number, val b: Number): Operation3()
    data class Mul(val a: Number, val b: Number): Operation3()
}

// Subclasses of sealed classes can hold instance-specific data, enums not.
// Enum can only have a single instance (object), where a subclass of a sealed class can have multiple instances
