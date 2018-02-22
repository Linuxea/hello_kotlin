package basic

/**
 * @author linuxea
 * @date 2018/2/22
 */

var lambdaAdd: (Int, Int) -> Int = { x, y -> x + y }


fun main(args: Array<String>) {
    println(lambdaAdd(1, 2))

    println(lambdaAdd(11, 22))
}