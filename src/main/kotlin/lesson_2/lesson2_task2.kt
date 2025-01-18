package org.example.lesson_2

fun main() {
    // Данные о постоянных сотрудниках
    val permanentEmployeesCount = 50
    val permanentEmployeeSalary = 30000

    // Данные о стажерах
    val internsCount = 30
    val internSalary = 20000

    //Расходы на выплату зарплаты постоянных сотрудников
    val permanentSalariesTotal: Int = permanentEmployeesCount * permanentEmployeeSalary

    // Общие расходы по ЗП после прихода стажеров
    val totalSalaries: Int = permanentSalariesTotal + (internsCount * internSalary)

    // Средняя ЗП одного сотрудника после устройства стажеров
    val totalEmployeesCount = permanentEmployeesCount + internsCount
    val averageSalaryPerEmployee: Int = totalSalaries / totalEmployeesCount

    println("Расходы на выплату зарплаты постоянных сотрудников: $permanentSalariesTotal")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaries")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryPerEmployee")

}