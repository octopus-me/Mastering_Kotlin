package classes

interface MenuItem {
    val id: String
    val name: String
    var price: Double

    fun displayDetails()
}