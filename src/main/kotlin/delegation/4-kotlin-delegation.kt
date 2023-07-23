package delegation

class CountingSetV4<T>(private val delegate: MutableSet<T> = HashSet()) : MutableSet<T> by delegate {
    var addCount = 0L

    override fun add(element: T): Boolean {
        addCount++
        return delegate.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        addCount += elements.size
        return delegate.addAll(elements)
    }
}

class CountingSetV5<T>(private val delegate: MutableSet<T>) : MutableSet<T> by delegate {
    var addCount = 0L

    constructor() : this(HashSet())

    override fun add(element: T): Boolean {
        addCount++
        return delegate.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        addCount += elements.size
        return delegate.addAll(elements)
    }
}

fun main() {
    val countingSet = CountingSetV5<Int>().apply {
        addAll(listOf(1, 2, 3, 4))
    }
    println(countingSet.addCount)
}
