package org.example.lesson_2

fun main() {
    // Время выезда (часы и минуты)
    val departureHour: Int = 9
    val departureMinute: Int = 39

    // Время в пути в минутах
    val travelTimeMinutes: Int = 457

    // Общие минуты выезда
    val totalDepartureMinutes: Int = departureHour * 60 + departureMinute

    // Общие минуты прибытия
    val totalArrivalMinutes: Int = totalDepartureMinutes + travelTimeMinutes

    // Вычисляем часы и минуты прибытия
    val arrivalHour: Int = totalArrivalMinutes / 60
    val arrivalMinute: Int = totalArrivalMinutes % 60

    // Приводим часы к 24-часовому формату
    val formattedArrivalHour: Int = arrivalHour % 24

    // Вывод результата
    println("Время прибытия поезда: $formattedArrivalHour:${String.format("%02d", arrivalMinute)}")
}