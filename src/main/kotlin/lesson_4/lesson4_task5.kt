package org.example.lesson_4

fun main() {
    println("Есть ли повреждения корпуса? (true/false)")
    val hasDamage = readln().toBoolean()

    println("Введите количество членов экипажа:")
    val crewCount = readln().toInt()

    println("Введите количество ящиков провизии:")
    val foodBoxes = readln().toInt()

    println("Благоприятная ли погода? (true/false)")
    val isGoodWeather = readln().toBoolean()

    val canSail = (!hasDamage && crewCount >= 55 && crewCount <= 70 && foodBoxes > 50) ||
            (hasDamage && crewCount == 70 && isGoodWeather && foodBoxes >= 50)

    println("Может ли корабль отправиться в плавание: $canSail")
}