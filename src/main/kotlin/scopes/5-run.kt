package scopes

// Context - this, return value - lambda result
// Can be used without context object

data class SimpleService(var url: String, var port: Int = 80) {
    fun post(body: String): String = "Request sent with body $body"
    fun prepareMappingOrSomething(): String = "{...}"
}

fun runThisCode() {
    val charactersCount = StringBuilder().run {
        append("LOOOOOOL")
        append("XDDDDDDD")
        length
    }
    println(charactersCount)
    // But why? We already have let and it was less confusing
}

fun runThisCodeAndConfigure() {
    val xmdService = SimpleService("https://xmd.b1-prv.qualtrics.com", 3000)

    // run
    val result = xmdService.run {
        port = 4000
        post("{mapping: ${prepareMappingOrSomething()} }")
    }

    // vs let
    val letResult = xmdService.let {
        it.port = 8080
        it.post("{mapping: ${it.prepareMappingOrSomething()} }")
    }
}

fun runAsNonExtension() {
    // stolen from Kotlin docs, lol :3
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }
}

fun main() {
    //runThisCode()
    //runThisCodeAndConfigure()
    //runAsNonExtension()
}
