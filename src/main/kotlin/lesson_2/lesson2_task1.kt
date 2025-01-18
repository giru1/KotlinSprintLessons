package org.example.lesson_2

fun main() {
    val students: Short = 4
    val averageScore = (3 + 4 + 3 + 5) / students.toDouble()
    println("Средний балл по английскому: %.2f".format(averageScore))
}
