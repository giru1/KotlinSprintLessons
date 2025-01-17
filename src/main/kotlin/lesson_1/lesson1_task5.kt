package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 6480

    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60

    println("Время проведенное в космосе ${hours}:${minutes}:${seconds}")

}