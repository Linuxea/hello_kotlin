package nums

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    val a = 123
    val b = 123

    // 数值相等
    println(a == b)
    // 对象相等
    println(a === b)

    val c = 123456789
    val d = 123456789

    // 数值相等
    println(c == d)
    // 对象相等
    println(c === d)

    val e = 1234
    val f: Int = e
    println(e == f)
    println(e === f)

//    why all is true  jordan crying ...
//    true
//    true
//    true
//    true
//    true
//    true
}