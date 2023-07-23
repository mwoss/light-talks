package extensions

val String.lastLetter: Char
    get() = this.last()

val <T> List<T>.middleElement: T
    get() = this[size / 2]

/*
Extension properties does not work with backing fields as they are not a part of extended class
(backing field - intermediate field/value generated for a property that uses default implementation, just to work in JVM world)
*/

fun main() {
    println("Spanko".lastLetter)
    println(listOf(1, 2, 3, 4, 5).middleElement)

//    listOf(1,2).middleElement = 2
}
