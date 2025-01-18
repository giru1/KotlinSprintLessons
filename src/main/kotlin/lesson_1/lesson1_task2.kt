package org.example.lesson_1

fun main() {
    // Объявление и инициализация переменных
    val numberOfOrders = 5
    val thankYouMessage = "Спасибо за вашу покупку! Мы ценим ваш выбор и надеемся на дальнейшее сотрудничество."

    // Вывод значений переменных в консоль
    println("Количество заказов: $numberOfOrders")
    println(thankYouMessage)

    // Объявление переменной для хранения количества работников
    var numberOfEmployees = 2000
    println("Количество работников: $numberOfEmployees")

    // Закомментированный код с предыдущим значением количества работников
    // println("Количество работников: $numberOfEmployees")

    // Обновление значения количества работников после увольнения одного работника
    numberOfEmployees -= 1
    println("Количество работников после увольнения: $numberOfEmployees")
}