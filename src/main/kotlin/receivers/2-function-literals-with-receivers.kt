package receivers

import kotlinx.html.ATarget
import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.html
import kotlinx.html.stream.createHTML

val consumer = createHTML()
val html = consumer.html {
    body {
        div {
            a("https://qualtircs.com") {
                target = ATarget.blank
                +"LOL XD"
            }
        }
    }
}


