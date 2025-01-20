package org.example.lesson_3

fun main() {

    val from = "E2"
    val to = "E4"
    val moveNumber = 1

    val moveString = "[$from-$to;$moveNumber]"
    println(moveString)

    val newFrom = "D2"
    val newTo = "D3"
    val newMoveNumber = 2

    val newMoveString = "[$newFrom-$newTo;$newMoveNumber]"
    println(newMoveString)
}