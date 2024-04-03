// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
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
public value class ImmutableArray<T> @PublishedApi internal constructor(
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
    internal val values: Array<T>,
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
     * See [Array.isEmpty]
     */
    public fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [Array.isNotEmpty]
     */
    public fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public operator fun `get`(index: Int): T = values[index]

    /**
     * See [Array.getOrNull]
     */
    public fun getOrNull(index: Int): T? = values.getOrNull(index)

    /**
     * See [Array.getOrElse]
     */
    public inline fun getOrElse(index: Int, defaultValue: (index: Int) -> T): T =
            values.getOrElse(index, defaultValue)

    public operator fun component1(): T = get(0)

    public operator fun component2(): T = get(1)

    public operator fun component3(): T = get(2)

    public operator fun component4(): T = get(3)

    public operator fun component5(): T = get(4)

    /**
     * See [Array.single]
     */
    public fun single(): T = values.single()

    /**
     * See [Array.first]
     */
    public fun first(): T = values.first()

    /**
     * See [Array.first]
     */
    public fun first(predicate: (element: T) -> Boolean): T = values.first(predicate)

    /**
     * See [Array.firstOrNull]
     */
    public fun firstOrNull(): T? = values.firstOrNull()

    /**
     * See [Array.firstOrNull]
     */
    public fun firstOrNull(predicate: (element: T) -> Boolean): T? = values.firstOrNull(predicate)

    /**
     * See [Array.last]
     */
    public fun last(): T = values.last()

    /**
     * See [Array.last]
     */
    public fun last(predicate: (element: T) -> Boolean): T = values.last(predicate)

    /**
     * See [Array.lastOrNull]
     */
    public fun lastOrNull(): T? = values.lastOrNull()

    /**
     * See [Array.toList]
     */
    public fun toList(): List<T> = values.toList()

    /**
     * See [Array.toMutableList]
     */
    public fun toMutableList(): MutableList<T> = values.toMutableList()

    /**
     * See [Array.iterator]
     */
    public operator fun iterator(): Iterator<T> = values.iterator()

    /**
     * See [Array.asIterable]
     */
    public fun asIterable(): Iterable<T> = values.asIterable()

    /**
     * See [Array.withIndex]
     */
    public fun withIndex(): Iterable<IndexedValue<T>> = values.withIndex()

    /**
     * See [Array.asSequence]
     */
    public fun asSequence(): Sequence<T> = values.asSequence()

    /**
     * See [Array.forEach]
     */
    public inline fun forEach(action: (element: T) -> Unit): Unit = values.forEach(action)

    /**
     * See [Array.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: T) -> Unit): Unit =
            values.forEachIndexed(action)

    public companion object {
        /**
         * Creates a ImmutableArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        @Suppress("UNCHECKED_CAST")
        public inline operator fun <T> invoke(size: Int, `init`: (index: Int) -> T):
                ImmutableArray<T> {
            val backingArray = Array<Any?>(size) { index -> init(index) }
            return ImmutableArray(backingArray as Array<T>)
        }
    }
}
