package oop

/**
 * @author linuxea
 * @date 2018/2/23
 */

class Box<T>(val t: T)

fun main(args: Array<String>) {
    var box = Box(1)
    var box1 = Box("abc")
    var box2 = Box(Box(1.2F))

    println(box)
    println(box1)
    println(box2)

}