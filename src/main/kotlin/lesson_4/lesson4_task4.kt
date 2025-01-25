package org.example.lesson_4

fun main() {
    val dayOfTraining = 5
    val isFirstGroupDay = dayOfTraining % 2 == 1

    println("""Упражнения для рук:       $isFirstGroupDay
        |Упражнения для ног:       ${!isFirstGroupDay}
        |Упражнения для спины:     ${!isFirstGroupDay}
        |Упражнения для пресса:    $isFirstGroupDay""".trimMargin())
}