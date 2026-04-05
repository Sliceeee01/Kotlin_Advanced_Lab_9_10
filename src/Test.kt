//var age: Int = 18
//    set(value) {
//        if ((value > 0)and (value < 110))
//            field = value
//    }
//
//fun main() {
//    println(age)
//    age = 45
//    println(age)
//    age = -345
//    println(age)
//}
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
){
    override fun toString(): String {
        return "Id предмета: $id\nName: $name\nКоличество: $quantity\n"
    }
}

fun main() {
    val sword = Item(id = 1, name = "Sword", quantity = 1)
    val betterSword = sword.copy(quantity = 2)
    println(sword.toString())
    println(betterSword.toString())

    val swordCopy = sword.copy(quantity = sword.quantity + 1)
    println("Копия с изменённым количеством: $swordCopy")

    println("Оригинал после copy: $sword")

    val (id, name, quantity) = sword
    println("Декомпозиция: id=$id, name=$name, quantity=$quantity")
}

