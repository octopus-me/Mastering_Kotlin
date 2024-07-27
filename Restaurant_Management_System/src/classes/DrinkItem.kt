package classes

class DrinkItem(
    override val id: String,
    override var name: String,
    override var price: Double,
    private val isAlcoholic: Boolean
):MenuItem {
    override fun displayDetails() {
        println("\nName: $name \n" +
                "Price: $price \n" +
        "IsAlcoholic: $isAlcoholic")
    }
}