// KT-9620 AssertionError in checkBounds

interface E1<T : D<String>, D>

interface A
interface B
interface D<X>
interface E2<T : D<A>, D<!SYNTAX!><<!><!SYNTAX!>B<!><!SYNTAX!>><!><!SYNTAX!>><!>

// KT-11354 AE from DescriptorResolver

open class L<E>()

class M<C> : L<C<C>>()
