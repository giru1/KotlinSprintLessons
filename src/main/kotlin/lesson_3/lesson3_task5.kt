package org.example.lesson_3

fun main() {

    val inputString = "D2-D4;0"

    // Разделяем строку на части с помощью функция .split
    val (move, moveNumber) = inputString.split(";")  // Разделяем по символу ';'
    val (from, to) = move.split("-")  // Разделяем по символу '-'

    // Присваиваем значения переменным
    val fromPosition = from  // Откуда
    val toPosition = to      // Куда
    val numberOfMove = moveNumber // Номер хода

    // Выводим результаты
    println("Откуда: $fromPosition")
    println("Куда: $toPosition")
    println("Номер хода: $numberOfMove")

}