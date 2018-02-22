package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
interface Runnable {
    fun run()
    fun start() {
        println("start over")
    }
}

class E : Runnable {

    init {
        println("class E init")
    }

    override fun run() {
        println("i am override method run")
    }

}

fun main(args: Array<String>) {
    var e = E()
    e.run()
    e.start()
}