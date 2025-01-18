package org.example.lesson_1

fun main() {
    // Константы для перевода времени
    val secondsInAnHour: Short = 3600
    val secondsInAMinute: Short = 60

    // Общее количество секунд
    val totalSeconds: Short = 6480

    val hours: Int = totalSeconds / secondsInAnHour
    val minutes: Int = (totalSeconds % secondsInAnHour) / secondsInAMinute
    val seconds: Int = totalSeconds % secondsInAMinute

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время проведенное в космосе $formattedTime")
}
