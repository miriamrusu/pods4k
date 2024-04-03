// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.PublishedApi
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
public value class ImmutableIntArray @PublishedApi internal constructor(
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
    internal val values: IntArray,
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
     * See [IntArray.isEmpty]
     */
    public fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [IntArray.isNotEmpty]
     */
    public fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public operator fun `get`(index: Int): Int = values[index]

    /**
     * See [IntArray.getOrNull]
     */
    public fun getOrNull(index: Int): Int? = values.getOrNull(index)

    /**
     * See [IntArray.getOrElse]
     */
    public inline fun getOrElse(index: Int, defaultValue: (index: Int) -> Int): Int =
            values.getOrElse(index, defaultValue)

    public operator fun component1(): Int = get(0)

    public operator fun component2(): Int = get(1)

    public operator fun component3(): Int = get(2)

    public operator fun component4(): Int = get(3)

    public operator fun component5(): Int = get(4)

    /**
     * See [IntArray.single]
     */
    public fun single(): Int = values.single()

    /**
     * See [IntArray.first]
     */
    public fun first(): Int = values.first()

    /**
     * See [IntArray.first]
     */
    public fun first(predicate: (element: Int) -> Boolean): Int = values.first(predicate)

    /**
     * See [IntArray.firstOrNull]
     */
    public fun firstOrNull(): Int? = values.firstOrNull()

    /**
     * See [IntArray.firstOrNull]
     */
    public fun firstOrNull(predicate: (element: Int) -> Boolean): Int? =
            values.firstOrNull(predicate)

    /**
     * See [IntArray.last]
     */
    public fun last(): Int = values.last()

    /**
     * See [IntArray.last]
     */
    public fun last(predicate: (element: Int) -> Boolean): Int = values.last(predicate)

    /**
     * See [IntArray.lastOrNull]
     */
    public fun lastOrNull(): Int? = values.lastOrNull()

    /**
     * See [IntArray.lastOrNull]
     */
    public fun lastOrNull(predicate: (element: Int) -> Boolean): Int? = values.lastOrNull(predicate)

    /**
     * See [IntArray.toList]
     */
    public fun toList(): List<Int> = values.toList()

    /**
     * See [IntArray.toMutableList]
     */
    public fun toMutableList(): MutableList<Int> = values.toMutableList()

    /**
     * See [IntArray.iterator]
     */
    public operator fun iterator(): Iterator<Int> = values.iterator()

    /**
     * See [IntArray.asIterable]
     */
    public fun asIterable(): Iterable<Int> = values.asIterable()

    /**
     * See [IntArray.withIndex]
     */
    public fun withIndex(): Iterable<IndexedValue<Int>> = values.withIndex()

    /**
     * See [IntArray.asSequence]
     */
    public fun asSequence(): Sequence<Int> = values.asSequence()

    /**
     * See [IntArray.forEach]
     */
    public inline fun forEach(action: (element: Int) -> Unit): Unit = values.forEach(action)

    /**
     * See [IntArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Int) -> Unit): Unit =
            values.forEachIndexed(action)

    public companion object {
        /**
         * Creates a ImmutableIntArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Int):
                ImmutableIntArray {
            val backingArray = IntArray(size) { index -> init(index) }
            return ImmutableIntArray(backingArray)
        }
    }
}
