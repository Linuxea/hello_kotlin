package nums

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    println(1 is Int)
    println(2 is Int)
    println("abc" is String)

    val dd: Double = 1234.0
    println(dd is Double)

    val ff: Float = 1234.0f
    println(ff is Float)

    println(10 in 1..10)
    println(10 in 1 until 10)

}