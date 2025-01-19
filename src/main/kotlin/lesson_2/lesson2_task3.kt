package org.example.lesson_2

fun main() {
    // Время выезда (часы и минуты)
    val departureHour: Int = 9
    val departureMinute: Int = 39

    // Время в пути в минутах
    val travelTimeMinutes: Int = 457

    val minuteInHour: Int = 60
    val hoursInDay: Int = 24

    // Общие минуты выезда
    val totalDepartureMinutes: Int = departureHour * minuteInHour + departureMinute

    // Общие минуты прибытия
    val totalArrivalMinutes: Int = totalDepartureMinutes + travelTimeMinutes

    // Вычисляем часы и минуты прибытия
    val arrivalHour: Int = totalArrivalMinutes / minuteInHour
    val arrivalMinute: Int = totalArrivalMinutes % minuteInHour

    // Приводим часы к 24-часовому формату
    val formattedArrivalHour: Int = arrivalHour % hoursInDay

    // Вывод результата
    println("Время прибытия поезда: $formattedArrivalHour:${String.format("%02d", arrivalMinute)}")
}