// !CHECK_TYPE

import kotlin.reflect.KProperty1

class C {
    val baz: Int = 12
}

fun Int.baz() {}

fun test() {
    C::baz checkType { <!UNRESOLVED_REFERENCE!>_<!><KProperty1<C, Int>>() }
}
