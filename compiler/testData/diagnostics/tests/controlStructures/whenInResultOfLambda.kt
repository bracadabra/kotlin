// !WITH_NEW_INFERENCE
// NI_EXPECTED_FILE

val test1 = { when (true) { true -> <!OI;IMPLICIT_CAST_TO_ANY!>1<!>; else -> <!OI;IMPLICIT_CAST_TO_ANY!>""<!> } }

val test2 = { { when (true) { true -> <!OI;IMPLICIT_CAST_TO_ANY!>1<!>; else -> <!OI;IMPLICIT_CAST_TO_ANY!>""<!> } } }

val test3: (Boolean) -> Any = { when (true) { true -> 1; else -> "" } }

val test4: (Boolean) -> Any? = { when (true) { true -> 1; else -> "" } }

fun println() {}

val test5 = {
    when (true) {
        true -> println()
        else -> println()
    }
}
