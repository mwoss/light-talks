package equality

// == (structural equality)
// === (referential equality)
// equals

data class Survey(
    val id: Int,
    val name: String,
)

const val one = 1
const val oneone = 1
const val two = 2

const val s1 = "lol"
const val s2 = "lol"

const val float1 = 0.0
const val float2 = -0.0

fun main() {
    val survey1 = Survey(1, "lol")
    val survey2 = Survey(2, "xd")

    val survey1Copy = survey1.copy()

    val survey3 = survey1
//
//    println(survey1 == survey2)
//    println(survey1 === survey2)
//
//    println(survey1 == survey1Copy)
//    println(survey1 === survey1Copy)
//
//    println(survey1 == survey3)
//    println(survey1 === survey3)
//
//    println(one == two)
//    println(one === two)
//    println(one == oneone)
//    println(one === oneone)
//
//    println(s1 == s2)
//    println(s1 === s2)
//
    println(float1 == float2)
    println(float1 === float2)
}
