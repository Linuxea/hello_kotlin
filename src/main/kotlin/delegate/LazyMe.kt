package delegate

/**
 * @author linuxea
 * @date 2018/2/24
 */
// if var should set?.
val lazyMe: String by lazy {
    println("lazy me ok")
    "hello lazy"
}

fun main(args: Array<String>) {
    println(lazyMe)
    println(lazyMe)
}

