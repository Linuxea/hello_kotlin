package range

/**
 * @author linuxea
 * @date 2018/2/22
 */
fun main(args: Array<String>) {

    // [1, 10]
    for (x in 1..10) {
        print(x)
        print(" ")
    }

    println()

    // [1, 10)
    for (x in 1 until 10) {
        print(x)
        print(" ")
    }

    println()

    // step is 2
    for (x in 1 until 10 step 2) {
        print(x)
        print(" ")
    }

    println()

    // top -> short [10, 1]
    for (x in 10 downTo 1) {
        print(x)
        print(" ")
    }

    println()

    // top -> short [10, 1] step is 2
    for (x in 10 downTo 1 step 2) {
        print(x)
        print(" ")
    }

    println()


}