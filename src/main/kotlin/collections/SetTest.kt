package collections

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    var of = setOf(1, 2, 2, 3, 4)
    println(of)
    println(of.size)
    of.forEach(::print)
}