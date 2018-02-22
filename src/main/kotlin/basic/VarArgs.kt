package basic

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun vars(vararg args: Any) {
    for (x in args) {
        println(x)
    }
}

fun main(args: Array<String>) {
    vars("a", "b，1", 1, 2, Integer.valueOf(2))
}