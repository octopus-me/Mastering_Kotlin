import classes.Restaurant
import classes.FoodIdem
import classes.Order
import classes.DrinkItem

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val restaurant = Restaurant("Gourmet Bistro")

    val pizza = FoodIdem("F001", "Pizza", 12.99, listOf("Dough", "Tomato Sauce", "Cheese"))
    val burger = FoodIdem("F002", "Burger", 9.99, listOf("Bun", "Beef Patty", "Lettuce"))
    val cola = DrinkItem("D001", "Cola", 1.99, false)
    val wine = DrinkItem("D002", "Wine", 6.99, true)

    restaurant.addMenuItem(pizza)
    restaurant.addMenuItem(burger)
    restaurant.addMenuItem(cola)
    restaurant.addMenuItem(wine)

    restaurant.displayMenu()

    val order1 = Order()
    order1.addItem(pizza)
    order1.addItem(cola)
    restaurant.placeOrder(order1)

    order1.removeItem("F001")
    restaurant.completeOrder(order1.orderId)

    val order2 = Order()
    order2.addItem(burger)
    order2.addItem(wine)
    restaurant.placeOrder(order2)

    restaurant.completeOrder(order2.orderId)
}