package extends

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun String.fuck() {
    println("string fuck")
}

class User(name: String)

fun User.fuck() {
    println("user fuck!")
}

fun main(args: Array<String>) {
    var string = String()
    string.fuck()

    var user = User("bobo")
    user.fuck()
}