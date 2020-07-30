// WITH_RUNTIME

/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 1.4-rfc+0.3-591
 * MAIN LINK: declarations, classifier-declaration, data-class-declaration -> paragraph 2 -> sentence 12
 * NUMBER: 3
 * DESCRIPTION:  generated component function has the same type as this property and returns the value of this property
 */
const val TMP_HASH_CODE = 555;

open class B(open val a: Int, open val b: Any) {
    override fun hashCode(): Int {
        return TMP_HASH_CODE
    }
}

data class A(override val a: Int, override val b: String) : B(a, b)

fun box(): String {
    val x = A(1, "str")

    if (x.component1() is Int
        && x.component2() is String
        && x.component1() == 1 &&
        x.component2() == "str"
    ) {
        return "OK"
    } else return "nok"
}

