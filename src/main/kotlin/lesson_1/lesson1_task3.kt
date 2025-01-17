package org.example.lesson_1

fun main() {
    // Объявление и инициализация переменных
    val year = 1961
    var hour = 9
    var minute = 7

    // Вывод года, часа и минуты взлета
    println(year)
    println(hour)
    println(minute)

    // Изменение значений переменных для времени посадки
    hour = 15
    minute = 45

    // Вывод времени посадки в формате [часы:минуты]
    print("Время посадки: ${hour}:${minute}")
}