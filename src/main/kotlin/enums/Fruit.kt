package enums

/**
 * @author linuxea
 * @date 2018/2/22
 */
enum class Fruit(name: String) {
    APPLE("apple"),
    PEAR("pear")
}

fun main(args: Array<String>) {
    println(Fruit.APPLE)
    println(Fruit.PEAR.name)
    println(Fruit.PEAR.ordinal)
}