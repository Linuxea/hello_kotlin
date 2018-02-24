package io

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 *  文件读
 * @author linuxea
 * @date 2018/2/24
 */

fun readMe(path: Path): String {
    val readAllLines = Files.readAllLines(path)
    val stringBuilder = StringBuilder()
    readAllLines.forEach { stringBuilder.append(it).append("\n") }
//    readAllLines.forEach(stringBuilder::append)
    return stringBuilder.toString()
}

fun writeMe(path: Path, stringList: List<String>) {
    Files.write(path, stringList, StandardOpenOption.APPEND)
}

fun main(args: Array<String>) {
    val readMe = readMe(Paths.get("C:\\Users\\Linux\\Documents\\gitHome\\hello_kotlin\\src\\main\\kotlin\\io\\FilesTest.kt"))
    println(readMe)

    val listOf = listOf("I love china", "I love you", "but i love kotlin too", "byebye")
    writeMe(Paths.get("C:\\Users\\Linux\\Documents\\gitHome\\hello_kotlin\\src\\main\\kotlin\\io\\writeme.txt"), listOf)

}