package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
open class Person(val name: String, val age: Int) {

    open fun printMe() {
        val result = "$name's age is $age"
        println(result)
    }
}

// why some have val
class Student(name: String, age: Int) : Person(name, age) {

    override fun printMe() {
        println("当初我没有机会，今天我${name}只想做个好学生")
    }
}

fun main(args: Array<String>) {
    var person = Person("linuxea", 12)
    person.printMe()

    var student = Student("bobo", 13)
    student.printMe()
}