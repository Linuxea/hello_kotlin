package delegate

import kotlin.properties.Delegates

/**
 * @author linuxea
 * @date 2018/2/24
 */
class ObservableUser {
    var name: String by Delegates.observable("init values") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val observableUser = ObservableUser()
    observableUser.name = "java"
    observableUser.name = "kotlin"
}