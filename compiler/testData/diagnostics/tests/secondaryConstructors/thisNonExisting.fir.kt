// !DIAGNOSTICS: -UNUSED_PARAMETER
// !WITH_NEW_INFERENCE

class A {
    constructor(x: Int) {}
    constructor(x: String) {}
    constructor(): <!INAPPLICABLE_CANDIDATE!>this<!>('a') {}
}
