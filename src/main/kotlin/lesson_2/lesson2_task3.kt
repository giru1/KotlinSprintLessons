package org.example.lesson_2

const val MINUTE_IN_HOUR: Int = 60
const val HOURS_IN_DAY: Int = 24

fun main() {
    // Время выезда (часы и минуты)
    val departureHour: Int = 9
    val departureMinute: Int = 39

    // Время в пути в минутах
    val travelTimeMinutes: Int = 457

    // Общие минуты выезда
    val totalDepartureMinutes: Int = departureHour * MINUTE_IN_HOUR + departureMinute

    // Общие минуты прибытия
    val totalArrivalMinutes: Int = totalDepartureMinutes + travelTimeMinutes

    // Вычисляем часы и минуты прибытия
    val arrivalHour: Int = totalArrivalMinutes / MINUTE_IN_HOUR
    val arrivalMinute: Int = totalArrivalMinutes % MINUTE_IN_HOUR

    // Приводим часы к 24-часовому формату
    val formattedArrivalHour: Int = arrivalHour % HOURS_IN_DAY

    // Вывод результата
    println("Время прибытия поезда: $formattedArrivalHour:${String.format("%02d", arrivalMinute)}")
}