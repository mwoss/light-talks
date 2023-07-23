package scopes

// Context - this, return value - lambda result

class CuteDog {
    fun pet() {}
    fun giveFood(foodType: Any) {}
    fun goOnAWalk(where: Any) {}
}

fun withGivenContextDo() {
    val dog = CuteDog()
    with(dog) {
        pet()
        giveFood("smaczki")
        goOnAWalk("park")
    }

    val numbers = listOf(1, 1, 1, 2, 3, 3, 3, 3)
    val weirdNumber = with(numbers) {
        first() * last() * average()
    }
    println(weirdNumber)

}
