package payment

fun main() {
    val processor = PaymentProcessor()
    val payments = listOf(
        Payment(card = "4111111111111111", sum = 1000, type = CardType.VISA),
        Payment(card = "5111111111111111", sum = 500, type = CardType.MASTERCARD),
        Payment(card = "2111111111111111", sum = 300, type = CardType.MIR),
        Payment(card = "1234567890123456", sum = 200, type = CardType.UNKNOWN),
        Payment(card = "4111111111111111", sum = -100, type = CardType.VISA)
    )
    for (payment in payments) {
        println("Обработка платежа: ${payment.card}, сумма: ${payment.sum}")
        val result = processor.pay(payment)
        processor.show(result)
        println()
    }
    println("=== Демонстрация enum ===")
    println("Все типы карт:")
    for (type in CardType.values()) {
        println("  - ${type.name} (ordinal: ${type.ordinal})")
    }
    println("Тип карты VISA: ${CardType.VISA}")
    println("\n=== Демонстрация data class ===")
    val payment1 = Payment(card = "4111111111111111", sum = 1000, type = CardType.VISA)
    val payment2 = payment1.copy(card = "4222222222222222")
    val payment3 = payment1.copy(sum = 1500)

    println("Оригинал: $payment1")
    println("Копия с новой картой: $payment2")
    println("Копия с новой суммой: $payment3")
    println("payment1 == payment2: ${payment1 == payment2}")
    println("payment1 == payment3: ${payment1 == payment3}")
}