package org.example.lesson_3

fun main() {

    val inputString = "D2-D4;0"

    val (move, moveNumber) = inputString.split(";")
    val (from, to) = move.split("-")

    val splitResult = move.split("-", ";")

    println("Тип переменной splitResult: ${splitResult::class.simpleName}")

    val fromPosition = from
    val toPosition = to
    val numberOfMove = moveNumber

    println("Откуда: $fromPosition")
    println("Куда: $toPosition")
    println("Номер хода: $numberOfMove")

}