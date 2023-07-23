package extensions

//class Corgi
//
//fun Corgi.getBreed() = "Corgi :3"


open class Dogo
class Corgi: Dogo()

fun Dogo.getBreed() = "Dog"
fun Corgi.getBreed() = "Corgi :3"

fun printBreed(s: Dogo) {
    println(s.getBreed())
}

fun printBreed(s: Corgi) {
    println(s.getBreed())
}


fun main() {
    println(Corgi().getBreed())
//    printBreed(Corgi())
}
