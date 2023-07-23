package types

import java.util.concurrent.TimeUnit

typealias TimeMs = Long

val Int.sec: Time
    get() = Time(this.toLong(), TimeUnit.SECONDS)
