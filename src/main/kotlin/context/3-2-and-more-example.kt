package context

import org.json.JSONObject

fun json(build: JSONObject.() -> Unit) {
    JSONObject().apply { build() }
}

context(JSONObject)
infix fun String.by(build: JSONObject.() -> Unit) {
    put(this, JSONObject().build())
}

context(JSONObject)
infix fun String.by(value: Any) {
    put(this, value)
}

fun main() {
    json {
        "name" by "Kotlin"
        "address" by {
            "city" by "Krakow"
            "street" by "Pawia"
        }
    }
}
