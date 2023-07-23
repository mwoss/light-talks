package delegation

import kotlin.properties.Delegates.notNull
import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable

class LazyTensorflow {
    val client by lazy {
        println("Initializing client...")
        Thread.sleep(3000)
        "Working client"
    }
}

class ObservableUser {
    var name: String by observable("<no name>") { _, old, new ->
        println("$old -> $new")
    }
}

class VetoableUser {
    var name: String by vetoable("<no name>") { _, old, new ->
        new != old && new.length > 1
    }
}

class MapableUser(properties: Map<String, Any?>) {
    val name: String by properties
    val age: Int by properties
}

class LateinitPrimitive {
    var number: Int by notNull()
}

class ToPropertyDelegate {
    var newValue: Int = 0
    @Deprecated("Use 'newValue' instead", ReplaceWith("newValue"))
    var oldValue: Int by this::newValue
}

fun main() {
//    LazyTensorflow().run {
//        println(client)
//        println(client)
//    }

//    ObservableUser().run {
//        name = "Alex"
//        name = "Aleksander"
//    }

//    VetoableUser().run {
//        name = "Igor"
//        name = "X"
//        println(name)
//    }

//    val properties = mapOf(
//        "name" to "¯\\_(ツ)_/¯",
//        "age" to 27
//    )
//    MapableUser(properties).run {
//        println(name)
//        println(age)
//    }

//    LateinitPrimitive().run {
//        number = 10
//        println(number)
//    }

//    ToPropertyDelegate().run {
//        oldValue = 1337
//        println(newValue)
//    }
}
