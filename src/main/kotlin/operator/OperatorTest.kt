package operator

/**
 * @author linuxea
 * @date 2018/2/22
 */
class Name(val age: Int) {

    operator fun plus(ok: Int): Name {
        return Name(age + ok)
    }

    operator fun minus(ok: Int): Name {
        return Name(age - ok)
    }

    override operator fun equals(name: Any?): Boolean {
        if (name is Name) {
            return age.compareTo(name.age) == 0
        }
        return false
    }

}

fun main(args: Array<String>) {
    var name = Name(12)
    println(name.age)
    var minAge = name - 2
    println(minAge.age)

    var plusAge = name + 8
    println(plusAge.age)

    // equals override
    var name1 = Name(89)
    var name2 = Name(89)
    println(name1.equals(name2))

}