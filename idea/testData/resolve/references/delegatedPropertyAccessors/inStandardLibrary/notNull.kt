// IGNORE_FIR

import kotlin.properties.Delegates

var x: Int <caret>by Delegates.notNull()

// MULTIRESOLVE
// REF: (in kotlin.properties.ReadWriteProperty).getValue(R, kotlin.reflect.KProperty<*>)
// REF: (in kotlin.properties.ReadWriteProperty).setValue(R, kotlin.reflect.KProperty<*>, T)
