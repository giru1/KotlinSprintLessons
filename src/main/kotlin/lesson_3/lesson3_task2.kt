package org.example.lesson_3

fun main() {
    // Исходные данные на момент 20 лет
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    var lastName = "Андреева"
    var age = 20

    // Вывод данных в 20 лет
    println("[$lastName $firstName $middleName, $age]")

    // Обновление данных после замужества
    lastName = "Сидорова"
    age = 22

    // Вывод данных в 22 года
    println("[$lastName $firstName $middleName, $age]")

}
