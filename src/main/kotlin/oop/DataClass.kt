package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
data class Room(val name: String)


fun main(args: Array<String>) {
    var room = Room("三年一班")
    println(room.name)
    println(room)
}