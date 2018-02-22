package nums

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    val a = 123
    val b = 234

    val c = if (a > b) a else b
    println(c)

    val d = if (a > b) {
        print("a 最大啦")
        a
    } else {
        print("b 才是最大哟")
        b
    }
    println(d)
}