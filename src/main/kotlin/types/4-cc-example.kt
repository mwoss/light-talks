package types

fun main() {
    run {
        cutClip(5.sec, 30.sec)
    }

    run {
        cutClip(start = 5.sec, duration = 30.sec)
    }

    run {
        data class PointInTime(val value: Time)
        data class TimeDelta(val value: Time)

        fun cutClip(start: PointInTime, duration: TimeDelta) {}
        fun cutClip(start: PointInTime, end: PointInTime) {}
    }
}

