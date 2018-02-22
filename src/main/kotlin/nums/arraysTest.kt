package nums

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    var intArrayOf = intArrayOf(1234, 234, 23, 4, 5)
    intArrayOf.forEach(::print)
    println()

    intArrayOf.map { x -> x.toString() }.forEach(::print)
    println()

    intArrayOf.map { x -> x.toString().length }.forEach(::println)

    // 字符串与python中都具有可迭代性
    for (s in "abcdefg") {
        print(s)
        print(" ")
    }


}