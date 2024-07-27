package classes

import java.util.*

class Order(
    val orderId: String = UUID.randomUUID().toString(),
    private val items: MutableList<MenuItem> = mutableListOf(),
    private var isCompleted: Boolean = false,
) {
    private var totalPrice: Double = 0.0

    fun addItem(item: MenuItem){
        items.add(item)
        calculateTotal(item.price)
        println("Added ${item.name} with price ${item.price} and isCompleted? ${isCompleted}")

    }

    fun removeItem(itemId: String){
        val item = findItem(itemId)

        if(item != null){
            items.remove(item)
            println("Item ${item.name} removed!")
            calculateTotal((-1)*item.price)
        } else println("Item $itemId does not exist!")
    }

    fun completeOrder(){
        isCompleted = true;
        println("Completed Order ${orderId}")

    }

    private fun calculateTotal(item_price: Double){
        this.totalPrice += item_price;

    }

    private fun findItem(itemId: String): MenuItem? {
        return items.find{it.name == itemId}
    }


}