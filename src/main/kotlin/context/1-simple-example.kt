package context

class Logger(val name: String) {
    fun log(s: String) {
        println("$name: $s")
    }

    fun x() {}
}

class NotificationService {
    fun log(s: String) {
        println("main: $s")
    }
}

context(Logger, NotificationService)
fun store(s: String) {
    // ups, overload resolution ambiguity
    //log("Stored $s on disk").apply {
    //    x()
    //}
    this@Logger.log("Stored $s on disk").run {
        x()
    }
}

context(LoggingProviderContext)
fun storeLessPainful(s: String) {
    logger.log("Logging to stdout")
    notification.log("Sending notification")
    logger.x()
}

interface LoggingProviderContext {
    val logger: Logger
    val notification: NotificationService
}

fun main() {
    val logger = Logger("main")
    val n = NotificationService()

    with(logger) {
        with(n) {
            store("image1.png")
            store("text.txt")
            store("image2.png")
        }
    }

    val context = object : LoggingProviderContext {
        override val logger: Logger
            get() = TODO("Not yet implemented")
        override val notification: NotificationService
            get() = TODO("Not yet implemented")
    }
    with(context) {
        storeLessPainful("image1.png")
        storeLessPainful("text.txt")
        storeLessPainful("image2.png")
    }
}
