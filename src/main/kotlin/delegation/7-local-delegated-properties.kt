package delegation

class Foo {
    fun isValid(): Boolean = TODO()

    fun doSomething(): Any = TODO()
}

@Suppress("UNREACHABLE_CODE")
fun example(computeFoo: () -> Foo) {
    val memoizedFoo by lazy(computeFoo)

    if (TODO("some conditions") && memoizedFoo.isValid()) {
        // if some conditions are will not be met, memoizedFoo won't be initialized
        memoizedFoo.doSomething()
    }
}
