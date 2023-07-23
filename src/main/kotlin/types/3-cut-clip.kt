package types

import java.util.concurrent.TimeUnit

data class Time(val value: Long, val unit: TimeUnit)

fun cutClip(start: Time, duration: Time) {}
