package delegation


class CountingSetV1<T> : HashSet<T>() {
    var addCount: Long = 0

    override fun add(element: T): Boolean {
        addCount++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        addCount += elements.size
        return super.addAll(elements)
    }
}

fun main() {
    val countingSet = CountingSetV1<Int>().apply {
        addAll(listOf(1, 2, 3, 4))
    }
    println(countingSet.addCount)
}

