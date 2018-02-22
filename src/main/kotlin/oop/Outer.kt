package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
class Outer {
    private val name: String = "nothing"
    var v = "成员属性"

    inner class Inner {
        fun iner() = name
        fun getY() {
            val th = this@Outer
            println("内部类可以引用外部类的成员，例如：" + th.v)
        }
    }
}

fun main(args: Array<String>) {
    var outer = Outer()
    println(outer.Inner().iner())
    println(outer.Inner().getY())
}