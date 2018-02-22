package oop

/**
 *  pure lambda
 * @author linuxea
 * @date 2018/2/22
 */
fun run() = 2

val ok = fun() {
    println("ok")
}

fun main(args: Array<String>) {
    println(run())
    println(ok)
    ok()
}