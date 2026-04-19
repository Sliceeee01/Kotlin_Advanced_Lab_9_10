package example

object GameSession {
    init {
        println("Игровая сессия создана")
    }
    var isActive: Boolean = false
    fun start() {
        isActive = true
        println("Игра началась")
    }
    fun end() {
        isActive = false
        println("Игра завершена")
    }
}

//fun main() {
//    println("Программа запущена")
//    println("Проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние ещё раз")
//    println("Активна ли сессия: ${GameSession.isActive}")
//
//    Logger.log("Первое сообщение")
//    Logger.log("Второе сообщение")
//    val logger1 = Logger
//    val logger2 = Logger
//    println(logger1 === logger2)
//}

object Logger {
    var count = 0
    fun log(message: String) {
        count++
        println("[$count] $message")
    }
}
object AppSettings {
    val version = "1.0.0"
    var isDarkMode = true
    fun toggleTheme() {
        isDarkMode = !isDarkMode
    }
}
class MyCar(val model: String) {
    fun drive() = println("$model edet")
}

object TrafficController {
    var carCount = 0
    fun carPassed() {
        carCount++
    }
}
//val clickListener = object : ClickListener {
//    override fun onClick() {
//        println("Clicked!")
//    }
//}
fun main() {
    MyCar(model = "Toyota")
    MyCar(model = "BMW")
    TrafficController.carPassed()
}