package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */

// what is this ?
fun fp() = {
    print("fp")
}

fun fp1(): String = "fp1"
// equals
fun fp2(): String {
    return "fp2"
}

val fp3 = fun() {
    print("fp3")
}

fun main(args: Array<String>) {
    println(fp()) //Function0<kotlin.Unit>
    println(fp1()) //fp1
    println(fp2())  // fp22kotlin.Unit

    println(fp())

    println(fp3)
    println(fp3())

}