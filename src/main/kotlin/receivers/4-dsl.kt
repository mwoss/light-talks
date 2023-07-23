package receivers

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

class HTML {
    private lateinit var children: MutableList<Any>

    fun init() {
        children = mutableListOf()
    }

    fun head(init: Head.() -> Unit): Head {
        val head = Head()
        head.init()
        children.add(head)
        return head
    }

    fun body(init: Body.() -> Unit): Body {
        val body = Body()
        body.init()
        children.add(body)
        return body
    }
}

class Body {}

class Head {}

val content = html {
    head {
        head {
            body {
                body { }
            }
        }
    }
    body { }
}
