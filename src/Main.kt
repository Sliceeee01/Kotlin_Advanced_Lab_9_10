import modules.ModuleResult
import modules.EnergyGenerator
import modules.ResearchLab
import resources.ResourceManager
import resources.OutpostResource

fun handleModuleResult(result: ModuleResult) {
    when (result) {
        is ModuleResult.Success -> println("УСПЕХ: ${result.message}")
        is ModuleResult.ResourceProduced -> println("Произведено: ${result.resourceName} +${result.amount}")
        is ModuleResult.NotEnoughResources -> println(
            "Недостаточно ресурса ${result.resourceName}. " +
                    "Нужно: ${result.required}, есть: ${result.available}"
        )
        is ModuleResult.Error -> println("ОШИБКА: ${result.reason}")
    }
}


fun main() {
    val manager = ResourceManager()

    val minerals = OutpostResource(id = 1, name = "Minerals", amount = 300)
    val gas = OutpostResource(id = 2, name = "Gas", amount = 100)

    manager.add(minerals)
    manager.add(gas)
    manager.printAll()

    val bonus = minerals.copy(amount = minerals.amount + 50)
    println("Копия минералов с бонусом: $bonus")
}