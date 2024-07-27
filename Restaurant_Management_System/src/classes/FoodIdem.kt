package classes

import java.util.*

class FoodIdem(
    override var id: String = UUID.randomUUID().toString(),
    override var name: String,
    override var price: Double,
    private var ingredients: List<String>,
):MenuItem {
    override fun displayDetails(){
        println("\nProduct $name \n" +
                "Price: $price \n" +
                "Ingredients: ${ingredients.joinToString(", ")} \n")
    }
}