package oop

/**
 * @author linuxea
 * @date 2018/2/22
 */
class Worker {
    var work: String = "worker"
        get() = field.toUpperCase()
        set(value) {
            // boring
            field = value.toLowerCase()
        }

    var sex: Int = 0 // 0 is boy
        set(value) {
            if (value == 0 || value == 1) {
                field = value
            } else {
                throw Exception("乱来吗")
            }
        }


}

fun main(args: Array<String>) {
    var worker: Worker = Worker()
    println(worker.work)

    println(worker.sex)
    worker.sex = 3

}