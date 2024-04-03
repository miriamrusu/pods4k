// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Boolean
import kotlin.Int
import kotlin.PublishedApi
import kotlin.Short
import kotlin.ShortArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.IndexedValue
import kotlin.collections.Iterable
import kotlin.collections.Iterator
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.jvm.JvmInline
import kotlin.ranges.IntRange
import kotlin.sequences.Sequence

@JvmInline
public value class ImmutableShortArray @PublishedApi internal constructor(
    /**
     * This is internal instead of private so we can have inline functions that delegate to the same
     * function on the backing array.  The backing array won't be accessible from Kotlin code since the
     * auto-generarted arrays are in their own module and the internal modifier prevents outside
     * access.  The constructor is also internal preventing anyone from creating an "instance" that
     * points to an array that they have access to.
     *
     * Attempting to bypass the internal visibility from java won't work since this is an inline
     * class so both the field and constructor are mangled by the Kotlin compiler.  While these might
     * appear to be accessible from Java due to the friendly Kotlin interop, these won't actually exist
     * with those names in the generated bytecode resulting in an unknown symbol exception.
     *
     * Therefore, the combination of being internal in its own module along with inline classes
     * makes this effectively private.
     */
    @PublishedApi
    internal val values: ShortArray,
) {
    public val size: Int
        get() = values.size

    /**
     * Returns the index of the last element or -1 if the array is empty.
     */
    public val lastIndex: Int
        get() = values.size - 1

    /**
     * Returns the range of valid indices for the array.
     */
    public val indices: IntRange
        get() = values.indices

    override fun toString(): String = values.joinToString(prefix = "[", postfix = "]")

    /**
     * See [ShortArray.isEmpty]
     */
    public fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [ShortArray.isNotEmpty]
     */
    public fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public operator fun `get`(index: Int): Short = values[index]

    /**
     * See [ShortArray.getOrNull]
     */
    public fun getOrNull(index: Int): Short? = values.getOrNull(index)

    /**
     * See [ShortArray.getOrElse]
     */
    public inline fun getOrElse(index: Int, defaultValue: (index: Int) -> Short): Short =
            values.getOrElse(index, defaultValue)

    public operator fun component1(): Short = get(0)

    public operator fun component2(): Short = get(1)

    public operator fun component3(): Short = get(2)

    public operator fun component4(): Short = get(3)

    public operator fun component5(): Short = get(4)

    /**
     * See [ShortArray.single]
     */
    public fun single(): Short = values.single()

    /**
     * See [ShortArray.first]
     */
    public fun first(): Short = values.first()

    /**
     * See [ShortArray.first]
     */
    public fun first(predicate: (element: Short) -> Boolean): Short = values.first(predicate)

    /**
     * See [ShortArray.firstOrNull]
     */
    public fun firstOrNull(): Short? = values.firstOrNull()

    /**
     * See [ShortArray.firstOrNull]
     */
    public fun firstOrNull(predicate: (element: Short) -> Boolean): Short? =
            values.firstOrNull(predicate)

    /**
     * See [ShortArray.last]
     */
    public fun last(): Short = values.last()

    /**
     * See [ShortArray.last]
     */
    public fun last(predicate: (element: Short) -> Boolean): Short = values.last(predicate)

    /**
     * See [ShortArray.lastOrNull]
     */
    public fun lastOrNull(): Short? = values.lastOrNull()

    /**
     * See [ShortArray.lastOrNull]
     */
    public fun lastOrNull(predicate: (element: Short) -> Boolean): Short? =
            values.lastOrNull(predicate)

    /**
     * See [ShortArray.toList]
     */
    public fun toList(): List<Short> = values.toList()

    /**
     * See [ShortArray.toMutableList]
     */
    public fun toMutableList(): MutableList<Short> = values.toMutableList()

    /**
     * See [ShortArray.iterator]
     */
    public operator fun iterator(): Iterator<Short> = values.iterator()

    /**
     * See [ShortArray.asIterable]
     */
    public fun asIterable(): Iterable<Short> = values.asIterable()

    /**
     * See [ShortArray.withIndex]
     */
    public fun withIndex(): Iterable<IndexedValue<Short>> = values.withIndex()

    /**
     * See [ShortArray.asSequence]
     */
    public fun asSequence(): Sequence<Short> = values.asSequence()

    /**
     * See [ShortArray.forEach]
     */
    public inline fun forEach(action: (element: Short) -> Unit): Unit = values.forEach(action)

    /**
     * See [ShortArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Short) -> Unit): Unit =
            values.forEachIndexed(action)

    public companion object {
        /**
         * Creates a ImmutableShortArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Short):
                ImmutableShortArray {
            val backingArray = ShortArray(size) { index -> init(index) }
            return ImmutableShortArray(backingArray)
        }
    }
}
