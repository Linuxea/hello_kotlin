package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
open class A {
    // 与 B 中的方法 c 冲突，子类必须重写
    open fun c() {
        println("a")
    }
}

interface B {
    fun c() {
        println("b")
    }
}

class C : A(), B {
    override fun c() {
        super<A>.c()
        super<B>.c()
    }

}

fun main(args: Array<String>) {
    var c = C()
    c.c()
}