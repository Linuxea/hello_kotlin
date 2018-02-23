package oop

/**
 * @author linuxea
 * @date 2018/2/23
 */

fun main(args: Array<String>) {

    data class DataPerson(val name: String, val age: Int)

    var dataPerson = DataPerson("linuxea", 123)
    println(dataPerson.age)
    println(dataPerson.name)
    println(dataPerson)
    var copy = dataPerson.copy(age = 2)
    println(copy)

    // 析构
    var component1 = dataPerson.component1()
    var component2 = dataPerson.component2()
    println(component1)
    println(component2)


}