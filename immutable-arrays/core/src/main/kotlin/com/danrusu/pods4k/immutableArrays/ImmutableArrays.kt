// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.util.Arrays
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Comparable
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.Suppress
import kotlin.Unit

/**
 * Returns an empty [ImmutableArray].
 */
public fun <T> emptyImmutableArray(): ImmutableArray<T> = ImmutableArray.EMPTY

/**
 * Returns an empty [ImmutableBooleanArray].
 */
public fun emptyImmutableBooleanArray(): ImmutableBooleanArray = ImmutableBooleanArray.EMPTY

/**
 * Returns an empty [ImmutableByteArray].
 */
public fun emptyImmutableByteArray(): ImmutableByteArray = ImmutableByteArray.EMPTY

/**
 * Returns an empty [ImmutableCharArray].
 */
public fun emptyImmutableCharArray(): ImmutableCharArray = ImmutableCharArray.EMPTY

/**
 * Returns an empty [ImmutableShortArray].
 */
public fun emptyImmutableShortArray(): ImmutableShortArray = ImmutableShortArray.EMPTY

/**
 * Returns an empty [ImmutableIntArray].
 */
public fun emptyImmutableIntArray(): ImmutableIntArray = ImmutableIntArray.EMPTY

/**
 * Returns an empty [ImmutableLongArray].
 */
public fun emptyImmutableLongArray(): ImmutableLongArray = ImmutableLongArray.EMPTY

/**
 * Returns an empty [ImmutableFloatArray].
 */
public fun emptyImmutableFloatArray(): ImmutableFloatArray = ImmutableFloatArray.EMPTY

/**
 * Returns an empty [ImmutableDoubleArray].
 */
public fun emptyImmutableDoubleArray(): ImmutableDoubleArray = ImmutableDoubleArray.EMPTY

/**
 * Returns an empty [ImmutableArray].
 */
public fun <T> immutableArrayOf(): ImmutableArray<T> = emptyImmutableArray()

/**
 * Returns an [ImmutableArray] containing the specified [values].
 */
public fun <T> immutableArrayOf(vararg values: T): ImmutableArray<T> = ImmutableArray(values.size) {
        values[it] }

/**
 * Returns an [ImmutableBooleanArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Boolean): ImmutableBooleanArray =
        ImmutableBooleanArray(values.size) { values[it] }

/**
 * Returns an [ImmutableByteArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Byte): ImmutableByteArray =
        ImmutableByteArray(values.size) { values[it] }

/**
 * Returns an [ImmutableCharArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Char): ImmutableCharArray =
        ImmutableCharArray(values.size) { values[it] }

/**
 * Returns an [ImmutableShortArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Short): ImmutableShortArray =
        ImmutableShortArray(values.size) { values[it] }

/**
 * Returns an [ImmutableIntArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Int): ImmutableIntArray = ImmutableIntArray(values.size)
        { values[it] }

/**
 * Returns an [ImmutableLongArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Long): ImmutableLongArray =
        ImmutableLongArray(values.size) { values[it] }

/**
 * Returns an [ImmutableFloatArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Float): ImmutableFloatArray =
        ImmutableFloatArray(values.size) { values[it] }

/**
 * Returns an [ImmutableDoubleArray] containing the specified [values].
 */
public fun immutableArrayOf(vararg values: Double): ImmutableDoubleArray =
        ImmutableDoubleArray(values.size) { values[it] }

/**
 * Builds an [ImmutableArray] for when the size isn't known in advance.
 */
public fun <T> buildImmutableArray(body: ImmutableArray.Builder<T>.() -> Unit): ImmutableArray<T> =
        ImmutableArray.Builder<T>().apply(body).build()

/**
 * Builds an [ImmutableBooleanArray] for when the size isn't known in advance.
 */
public fun buildImmutableBooleanArray(body: ImmutableBooleanArray.Builder.() -> Unit):
        ImmutableBooleanArray = ImmutableBooleanArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableByteArray] for when the size isn't known in advance.
 */
public fun buildImmutableByteArray(body: ImmutableByteArray.Builder.() -> Unit): ImmutableByteArray
        = ImmutableByteArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableCharArray] for when the size isn't known in advance.
 */
public fun buildImmutableCharArray(body: ImmutableCharArray.Builder.() -> Unit): ImmutableCharArray
        = ImmutableCharArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableShortArray] for when the size isn't known in advance.
 */
public fun buildImmutableShortArray(body: ImmutableShortArray.Builder.() -> Unit):
        ImmutableShortArray = ImmutableShortArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableIntArray] for when the size isn't known in advance.
 */
public fun buildImmutableIntArray(body: ImmutableIntArray.Builder.() -> Unit): ImmutableIntArray =
        ImmutableIntArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableLongArray] for when the size isn't known in advance.
 */
public fun buildImmutableLongArray(body: ImmutableLongArray.Builder.() -> Unit): ImmutableLongArray
        = ImmutableLongArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableFloatArray] for when the size isn't known in advance.
 */
public fun buildImmutableFloatArray(body: ImmutableFloatArray.Builder.() -> Unit):
        ImmutableFloatArray = ImmutableFloatArray.Builder().apply(body).build()

/**
 * Builds an [ImmutableDoubleArray] for when the size isn't known in advance.
 */
public fun buildImmutableDoubleArray(body: ImmutableDoubleArray.Builder.() -> Unit):
        ImmutableDoubleArray = ImmutableDoubleArray.Builder().apply(body).build()

/**
 * Returns an [ImmutableBooleanArray] containing the values of this array.
 *
 * [ImmutableBooleanArray] uses less memory and is faster to access as it stores the primitive
 * values directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Boolean>.toImmutableBooleanArray(): ImmutableBooleanArray =
        ImmutableBooleanArray(size) { this[it] }

/**
 * Returns an [ImmutableByteArray] containing the values of this array.
 *
 * [ImmutableByteArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Byte>.toImmutableByteArray(): ImmutableByteArray =
        ImmutableByteArray(size) { this[it] }

/**
 * Returns an [ImmutableCharArray] containing the values of this array.
 *
 * [ImmutableCharArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Char>.toImmutableCharArray(): ImmutableCharArray =
        ImmutableCharArray(size) { this[it] }

/**
 * Returns an [ImmutableShortArray] containing the values of this array.
 *
 * [ImmutableShortArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Short>.toImmutableShortArray(): ImmutableShortArray =
        ImmutableShortArray(size) { this[it] }

/**
 * Returns an [ImmutableIntArray] containing the values of this array.
 *
 * [ImmutableIntArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Int>.toImmutableIntArray(): ImmutableIntArray =
        ImmutableIntArray(size) { this[it] }

/**
 * Returns an [ImmutableLongArray] containing the values of this array.
 *
 * [ImmutableLongArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Long>.toImmutableLongArray(): ImmutableLongArray =
        ImmutableLongArray(size) { this[it] }

/**
 * Returns an [ImmutableFloatArray] containing the values of this array.
 *
 * [ImmutableFloatArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Float>.toImmutableFloatArray(): ImmutableFloatArray =
        ImmutableFloatArray(size) { this[it] }

/**
 * Returns an [ImmutableDoubleArray] containing the values of this array.
 *
 * [ImmutableDoubleArray] uses less memory and is faster to access as it stores the primitive values
 * directly without needing to store them in wrapper objects.
 */
public fun ImmutableArray<Double>.toImmutableDoubleArray(): ImmutableDoubleArray =
        ImmutableDoubleArray(size) { this[it] }

/**
 * Returns a typed [ImmutableBooleanArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableBooleanArray.toTypedImmutableArray(): ImmutableArray<Boolean> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableByteArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableByteArray.toTypedImmutableArray(): ImmutableArray<Byte> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableCharArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableCharArray.toTypedImmutableArray(): ImmutableArray<Char> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableShortArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableShortArray.toTypedImmutableArray(): ImmutableArray<Short> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableIntArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableIntArray.toTypedImmutableArray(): ImmutableArray<Int> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableLongArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableLongArray.toTypedImmutableArray(): ImmutableArray<Long> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableFloatArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableFloatArray.toTypedImmutableArray(): ImmutableArray<Float> =
        ImmutableArray(size) { this[it] }

/**
 * Returns a typed [ImmutableDoubleArray] containing the values of this array.
 *
 * Note that [ImmutableArray] uses more memory and is slower to access as each primitive value will
 * be auto-boxed in a wrapper object.
 */
public fun ImmutableDoubleArray.toTypedImmutableArray(): ImmutableArray<Double> =
        ImmutableArray(size) { this[it] }

/**
 * See [Array.getOrElse]
 */
public inline fun <T> ImmutableArray<T>.getOrElse(index: Int, defaultValue: (index: Int) -> T): T =
        values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableBooleanArray.getOrElse(index: Int,
        defaultValue: (index: Int) -> Boolean): Boolean = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableByteArray.getOrElse(index: Int, defaultValue: (index: Int) -> Byte): Byte
        = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableCharArray.getOrElse(index: Int, defaultValue: (index: Int) -> Char): Char
        = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableShortArray.getOrElse(index: Int, defaultValue: (index: Int) -> Short):
        Short = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableIntArray.getOrElse(index: Int, defaultValue: (index: Int) -> Int): Int =
        values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableLongArray.getOrElse(index: Int, defaultValue: (index: Int) -> Long): Long
        = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableFloatArray.getOrElse(index: Int, defaultValue: (index: Int) -> Float):
        Float = values.getOrElse(index, defaultValue)

/**
 * See [Array.getOrElse]
 */
public inline fun ImmutableDoubleArray.getOrElse(index: Int, defaultValue: (index: Int) -> Double):
        Double = values.getOrElse(index, defaultValue)

/**
 * Leaves [this] immutable array as is and returns an [ImmutableArray] with all elements sorted
 * according to their natural sort order.
 *
 * The sort is _stable_ so equal elements preserve their order relative to each other after sorting.
 */
@Suppress("UNCHECKED_CAST")
public fun <T : Comparable<T>> ImmutableArray<T>.sorted(): ImmutableArray<T> {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = Array<Any?>(size) { get(it) }
    Arrays.sort(backingArray)
    return ImmutableArray(backingArray) as ImmutableArray<T>
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableByteArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableByteArray.sorted(): ImmutableByteArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = ByteArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableByteArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableCharArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableCharArray.sorted(): ImmutableCharArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = CharArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableCharArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableShortArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableShortArray.sorted(): ImmutableShortArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = ShortArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableShortArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableIntArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableIntArray.sorted(): ImmutableIntArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = IntArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableIntArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableLongArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableLongArray.sorted(): ImmutableLongArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = LongArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableLongArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableFloatArray] with all elements sorted
 * according to their natural sort order.
 */
public fun ImmutableFloatArray.sorted(): ImmutableFloatArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = FloatArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableFloatArray(backingArray)
}

/**
 * Leaves [this] immutable array as is and returns an [ImmutableDoubleArray] with all elements
 * sorted according to their natural sort order.
 */
public fun ImmutableDoubleArray.sorted(): ImmutableDoubleArray {
    // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
    if (size <= 1) return this

    val backingArray = DoubleArray(size)
    System.arraycopy(values, 0, backingArray, 0, size)
    Arrays.sort(backingArray)
    return ImmutableDoubleArray(backingArray)
}
