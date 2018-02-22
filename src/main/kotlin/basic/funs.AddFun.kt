package basic

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun add(x: Int, y: Int): Int {
    return x + y
}


fun addPlus(x: Int, y: Int) = x + y

fun addPlus(x: Int, y: Int, z: Int): Int = x + y + z

fun main(args: Array<String>) {
    var add = add(1, 2)
    println(add)

    println(addPlus(12, 22))

    println(addPlus(1, 2, 3))
}