package delegate

import kotlin.reflect.KProperty

/**
 * @author linuxea
 * @date 2018/2/24
 */
class Example {
    // 建立联系
    var p: String by Delegate()
}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main(args: Array<String>) {
    var example = Example()
    println(example.p)

    example.p = "ok"
}