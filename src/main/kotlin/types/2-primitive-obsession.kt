package types

import java.util.concurrent.TimeUnit
import kotlin.time.milliseconds

object Example1 {
    const val USER_ADMIN_ROLE = 1

    const val user = "user"
    const val phoneNumber = "123-456-789"
}


fun main() {
    run {
        val time: Long
    }

    run {
        val timeMs: Long
    }

    run {
        val time: TimeMs
    }

    run {
        data class Time(val time: TimeMs)
    }

    run {
        data class Time(val value: Long, val unit: TimeUnit) {
//            operator fun plus(other: types.Time): types.Time ...
        }

        //val time = 100.milliseconds

        /* Don't put in name what can be in a type */
    }
}
