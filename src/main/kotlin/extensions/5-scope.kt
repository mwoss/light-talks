package extensions

private fun String.normalize(): String {
    return this.replace("LOL", "XD")
}

open class Test {
    protected fun xd() {}
}

fun main() {
    println("LOOL".prettify())
    println("XD LOL".normalize())
}
