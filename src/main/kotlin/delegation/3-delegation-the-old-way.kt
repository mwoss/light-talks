package delegation

import com.google.common.collect.ForwardingSet

class CountingSetV2<T> {
    var addCount: Long = 0

    private val delegate = HashSet<T>()

    fun add(element: T): Boolean {
        addCount++
        return delegate.add(element)
    }

    fun addAll(elements: Collection<T>): Boolean {
        addCount += elements.size
        return delegate.addAll(elements)
    }
}

class CountingSetV3<T> : ForwardingSet<T>() {
    var addCount: Long = 0

    private val delegate = HashSet<T>()

    override fun add(element: T): Boolean {
        addCount++
        return delegate().add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        addCount += elements.size
        return delegate().addAll(elements)
    }

    override fun delegate(): MutableSet<T> {
        return delegate
    }
}

fun main() {
//    val countingSet = CountingSetV2<Int>().apply {
//        addAll(listOf(1, 2, 3, 4))
//    }
//    println(countingSet.addCount)

    val countingSetGuava = CountingSetV3<Int>().apply {
        addAll(listOf(1, 2, 3, 4))
    }
    println(countingSetGuava.addCount)
    val s: Set<Int> = countingSetGuava
}
