package org.example.lesson_2

fun main() {
    // Данные о добытых материалах
    val crystalOre: Int = 7
    val ironOre: Int = 11

    // Процент баффа
    val buffPercentage: Double = 0.20

    // Вычисляем бонусные материалы
    val bonusCrystals: Int = (crystalOre * buffPercentage).toInt()
    val bonusIron: Int = (ironOre * buffPercentage).toInt()

    // Вывод результатов
    println("Бонусные кристаллы: $bonusCrystals")
    println("Бонусная железная руда: $bonusIron")
}