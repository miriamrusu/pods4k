// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Boolean
import kotlin.Byte
import kotlin.ByteArray
import kotlin.Int
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
public value class ImmutableByteArray @PublishedApi internal constructor(
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
    internal val values: ByteArray,
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
     * See [ByteArray.isEmpty]
     */
    public fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [ByteArray.isNotEmpty]
     */
    public fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public operator fun `get`(index: Int): Byte = values[index]

    /**
     * See [ByteArray.getOrNull]
     */
    public fun getOrNull(index: Int): Byte? = values.getOrNull(index)

    /**
     * See [ByteArray.getOrElse]
     */
    public inline fun getOrElse(index: Int, defaultValue: (index: Int) -> Byte): Byte =
            values.getOrElse(index, defaultValue)

    public operator fun component1(): Byte = get(0)

    public operator fun component2(): Byte = get(1)

    public operator fun component3(): Byte = get(2)

    public operator fun component4(): Byte = get(3)

    public operator fun component5(): Byte = get(4)

    /**
     * See [ByteArray.single]
     */
    public fun single(): Byte = values.single()

    /**
     * See [ByteArray.first]
     */
    public fun first(): Byte = values.first()

    /**
     * See [ByteArray.first]
     */
    public fun first(predicate: (element: Byte) -> Boolean): Byte = values.first(predicate)

    /**
     * See [ByteArray.firstOrNull]
     */
    public fun firstOrNull(): Byte? = values.firstOrNull()

    /**
     * See [ByteArray.firstOrNull]
     */
    public fun firstOrNull(predicate: (element: Byte) -> Boolean): Byte? =
            values.firstOrNull(predicate)

    /**
     * See [ByteArray.last]
     */
    public fun last(): Byte = values.last()

    /**
     * See [ByteArray.last]
     */
    public fun last(predicate: (element: Byte) -> Boolean): Byte = values.last(predicate)

    /**
     * See [ByteArray.lastOrNull]
     */
    public fun lastOrNull(): Byte? = values.lastOrNull()

    /**
     * See [ByteArray.toList]
     */
    public fun toList(): List<Byte> = values.toList()

    /**
     * See [ByteArray.toMutableList]
     */
    public fun toMutableList(): MutableList<Byte> = values.toMutableList()

    /**
     * See [ByteArray.iterator]
     */
    public operator fun iterator(): Iterator<Byte> = values.iterator()

    /**
     * See [ByteArray.asIterable]
     */
    public fun asIterable(): Iterable<Byte> = values.asIterable()

    /**
     * See [ByteArray.withIndex]
     */
    public fun withIndex(): Iterable<IndexedValue<Byte>> = values.withIndex()

    /**
     * See [ByteArray.asSequence]
     */
    public fun asSequence(): Sequence<Byte> = values.asSequence()

    /**
     * See [ByteArray.forEach]
     */
    public inline fun forEach(action: (element: Byte) -> Unit): Unit = values.forEach(action)

    /**
     * See [ByteArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Byte) -> Unit): Unit =
            values.forEachIndexed(action)

    public companion object {
        /**
         * Creates a ImmutableByteArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Byte):
                ImmutableByteArray {
            val backingArray = ByteArray(size) { index -> init(index) }
            return ImmutableByteArray(backingArray)
        }
    }
}
