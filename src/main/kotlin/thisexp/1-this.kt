package thisexp

class Dashboard(val id: Int, val widgets: List<String>) {
    fun printDashboardId() {
         println(id)
    }
}

fun Dashboard.getFirstWidget() = widgets.first()

fun main() {
    val d = Dashboard(1, listOf("tableWidget", "NPSWidget"))
    d.printDashboardId()
    println(d.getFirstWidget())
}
