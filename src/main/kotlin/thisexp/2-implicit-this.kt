package thisexp

// Not sure why this example does not work
// Maybe they fixed this "implicit this" gotcha, or it only works on specific Kotlin / JDK versions

fun printSomething() {
    println("LOOOL XDDD package level function here")
}

class Dummy {
    fun printSomething() { println("Hello :3 class member method here") }

    fun runPrint(usePackageLevel: Boolean = false)  {
        if (usePackageLevel) {
            printSomething()
        } else {
            this.printSomething()
        }
    }
}

fun main() {
    val d = Dummy()
    d.runPrint()
    d.runPrint(true)
}
