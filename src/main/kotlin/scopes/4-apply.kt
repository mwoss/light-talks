package scopes

// Context - this, return value - context object

data class Dog(
    var name: String,
    var breed: String = "mixed",
    var age: Int = 0,
    var isEnergetic: Boolean = true
)

fun applyCorgiStats(name: String): Dog {
    return Dog(name).apply {
        breed = "Corgi"
        age = 4
        isEnergetic = false
    }
}

data class Person(var name: String = "", var lastName: String = "", var age: Int = 0) {
    fun name(inName: String): Person = apply { name = inName }
    fun lastName(inLastName: String): Person = apply { lastName = inLastName }
    fun age(inAge: Int): Person = apply { age = inAge }
}


fun main() {
//    val doggo = applyCorgiStats("Luna")
    //println(doggo)

    val samSam = Person()
        .name("Sam")
        .lastName("Samix")
        .age(35)
    println(samSam)
}
