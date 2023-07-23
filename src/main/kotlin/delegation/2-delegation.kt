package delegation

class DistributedWorker {
    fun execute(job: Any): Any = println(job)
}

class Scheduler(private val worker: DistributedWorker) {
    // Delegation
    fun execute(job: Any): Any = worker.execute(job)
}

fun main() {
    val worker = DistributedWorker()
    val scheduler = Scheduler(worker)
    scheduler.execute(":333")
}
