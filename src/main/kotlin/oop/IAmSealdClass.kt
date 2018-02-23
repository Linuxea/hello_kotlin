package oop

/**
 * @author linuxea
 * @date 2018/2/23
 */

sealed class SealPerson(val name: String, val age: Int) {
    class Child(name: String, age: Int) : SealPerson(name, age)
    class Audit(name: String, age: Int) : SealPerson(name, age)
}

fun main(args: Array<String>) {

    var child = SealPerson.Child("linuxea", 3)
    println(child)
}