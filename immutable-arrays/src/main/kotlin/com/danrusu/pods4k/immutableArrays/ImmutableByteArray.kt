// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import com.danrusu.pods4k.immutableArrays.emptySingletons.EmptyIterator
import kotlin.Boolean
import kotlin.Byte
import kotlin.ByteArray
import kotlin.Int
import kotlin.PublishedApi
import kotlin.String
import kotlin.Unit
import kotlin.collections.Iterator
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.jvm.JvmInline
import kotlin.ranges.IntRange
import kotlin.sequences.Sequence

@JvmInline
public value class ImmutableByteArray @PublishedApi internal constructor(
    @PublishedApi
    internal val values: ByteArray,
) {
    public val size: Int
        get() = values.size

    /**
     * Returns the index of the last element or -1 if the array is empty.
     */
    public val lastIndex: Int
        get() = values.lastIndex

    /**
     * Returns the range of valid indices for the array.
     */
    public val indices: IntRange
        get() = values.indices

    override fun toString(): String = values.joinToString(prefix = "[", postfix = "]")

    public fun isEmpty(): Boolean = values.isEmpty()

    public fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public operator fun `get`(index: Int): Byte = values[index]

    /**
     * Returns the element at the specified [index] or null if the index is out of bounds.
     *
     * Note: 
     * This array stores primitive values but getOrNull returns a nullable reference type resulting
     * in the value being auto-boxed.
     *
     * When calling this method in a loop, for best performance and to reduce the pressure on the
     * garbage collector, we recommend ensuring that the [index] is always within bounds and use [get]
     * instead as that returns the primitive value without any autoboxing.
     */
    public fun getOrNull(index: Int): Byte? = values.getOrNull(index)

    public operator fun component1(): Byte = get(0)

    public operator fun component2(): Byte = get(1)

    public operator fun component3(): Byte = get(2)

    public operator fun component4(): Byte = get(3)

    public operator fun component5(): Byte = get(4)

    /**
     * Returns the single element from the array, or throws an exception if the array is empty or
     * has more than one element.
     */
    public fun single(): Byte = values.single()

    /**
     * Returns the first element.
     *
     * @throws NoSuchElementException if the array is empty.
     */
    public fun first(): Byte = values.first()

    /**
     * Returns the first element or null if the array is empty.
     */
    public fun firstOrNull(): Byte? = values.firstOrNull()

    /**
     * Returns the last element.
     *
     * @throws NoSuchElementException if the array is empty.
     */
    public fun last(): Byte = values.last()

    /**
     * Returns a [List] containing all the elements.
     */
    public fun toList(): List<Byte> = values.toList()

    /**
     * Returns a [MutableList] containing all the elements.
     */
    public fun toMutableList(): MutableList<Byte> = values.toMutableList()

    /**
     * Returns an iterator allowing iteration over the elements of the array.
     */
    public operator fun iterator(): Iterator<Byte> {
        if (isEmpty()) return EmptyIterator
        return values.iterator()
    }

    /**
     * Returns a [Sequence] which returns the elements of this array when iterated.
     */
    public fun asSequence(): Sequence<Byte> = values.asSequence()

    /**
     * Performs the specified [action] on each element sequentially starting with the first element
     */
    public inline fun forEach(action: (element: Byte) -> Unit): Unit = values.forEach(action)

    /**
     * Performs the specified [action] on each element sequentially starting with the first element
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
