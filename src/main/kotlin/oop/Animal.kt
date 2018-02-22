package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
abstract class Animal constructor(kind: String, legs: Int) {
    abstract var kind: String
    abstract var legs: Int

}

class Dog(kind: String, legs: Int) : Animal(kind, legs) {

    override var kind: String = "dog"
    override var legs: Int = 4

}

fun main(args: Array<String>) {
    var dog = Dog("linuxea", 12)
    println(dog.kind)
    println(dog.legs)
}