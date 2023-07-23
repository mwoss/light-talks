package platforms

fun main() {
    val provider = FacadeSimpleStatelessListProviderFactory()
    val list = provider.constructList()

    // T - for not null values
    // T? - it can be null, but also a type value
    // T! - T or T?

    list.forEach {
        println(it.lowercase())
    }

    // val dummy = provider.dummyValue
    // val dummy: String = provider.dummyValue

}

/**
 * -Xnullability-annotations=@<package-name>:<report-level>
 * Use JSR-305 annotations and compiler flags if you are migrating service to Kotlin or use libraries you own are written in Java
 */
