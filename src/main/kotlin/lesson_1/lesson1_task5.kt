package org.example.lesson_1

const val TOTAL_SECONDS: Short = 6480

fun main() {

    val hours: Int = TOTAL_SECONDS / 3600
    val minutes: Int = (TOTAL_SECONDS % 3600) / 60
    val seconds: Int = TOTAL_SECONDS % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время проведенное в космосе $formattedTime")
}
