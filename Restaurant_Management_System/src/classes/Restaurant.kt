package classes

class Restaurant(
    private val name: String,
) {
    private val menu: MutableList<MenuItem> = mutableListOf()
    private val orders: MutableList<Order> = mutableListOf()

    fun addMenuItem(menuItem: MenuItem) {
        menu.add(menuItem)
        println("Added ${menuItem.name}")
    }

    fun removeMenuItem(itemId: String) {
        val item = findMenuItemById(itemId)
        if(item != null){
            menu.remove(item)
            println("Removed ${item.name}")
        } else println("Item not found")
    }

    fun placeOrder(order: Order) {
        orders.add(order)
        println("Order added")
    }

    fun completeOrder(orderId: String) {
        val order = findOrderById(orderId)
        if(order != null) {
            order.completeOrder()
        } else println("Order not found")

    }

    fun displayMenu() {
        println("Menu for $name:")
        menu.forEach { it.displayDetails() }
    }

    private fun findMenuItemById(menuItemId: String): MenuItem? {
        return menu.find{it.id == menuItemId}
    }

    private fun findOrderById(orderId: String): Order? {
        return orders.find{it.orderId == orderId}
    }




}