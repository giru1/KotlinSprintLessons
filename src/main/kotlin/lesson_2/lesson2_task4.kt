package org.example.lesson_2

fun main() {
    // Данные о добытых материалах
    val crystalOre: Int = 7
    val ironOre: Int = 11

    // Процент баффа
    val buffPercentage: Int = 20

    // Вычисляем бонусные материалы
    val bonusCrystals: Int = (crystalOre * buffPercentage / 100)
    val bonusIron: Int = (ironOre * buffPercentage / 100)

    // Вывод результатов
    println("Бонусные кристаллы: $bonusCrystals")
    println("Бонусная железная руда: $bonusIron")
}