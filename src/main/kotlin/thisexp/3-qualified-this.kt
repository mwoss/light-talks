package thisexp

// Example copy-pasted from official Kotlin docs

class B { // implicit label @A
    inner class C { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@B // A's this
            val b = this@C // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = XDDDD@ fun String.() {
                fun x(): String {
                    return this@XDDDD
                }
                val d = this@XDDDD // funLit's receiver
            }



            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}
