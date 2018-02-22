package nums

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {
    whenTest(1)
    whenTest(3)
    whenTest(12)
    whenTest(134)
}

fun whenTest(i: Int) {
    when (i) {
        in 1..5 -> {
            print("between 1 and 5")
        }
        in 5..10 -> {
            print("between 5 and 10")
        }
        12, 13 -> {
            print("is 12 or 13")
        }
        else -> {
            print("error ")
        }
    }
}