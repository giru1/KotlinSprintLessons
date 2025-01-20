package org.example.lesson_3

fun main() {
    // Инициализация переменных для первого хода
    val from = "E2"          // Откуда
    val to = "E4"            // Куда
    val moveNumber = 1       // Номер хода

    // Формирование строки для отправки  фигуры
    val moveString = "[$from-$to;$moveNumber]"
    println(moveString)      // Вывод первого хода

    // Присвоение новых данных для следующего хода
    val newFrom = "D2"       // Новая позиция откуда
    val newTo = "D3"         // Куда (фигура на D2 продвигается на одну клетку вперед)
    val newMoveNumber = 2    // Номер следующего хода

    // Формирование строки для следующего хода
    val newMoveString = "[$newFrom-$newTo;$newMoveNumber]"
    println(newMoveString)    // Вывод следующего хода
}