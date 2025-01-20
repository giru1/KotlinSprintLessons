package org.example.lesson_2

fun main() {

    // Начальная сумма вклада
    val principal: Double = 70000.0

    // Процентная ставка (в десятичном виде)
    val interestRate: Double = 16.7 / 100

    // Количество лет
    val years: Int = 20

    // Расчёт итоговой суммы
    val finalAmount: Double = principal * Math.pow(1 + interestRate, years.toDouble())

    // Вывод результата с 3 знаками после запятой
    println("Размер вклада через $years лет: %.3f".format(finalAmount))

}