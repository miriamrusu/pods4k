// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.util.Arrays
import java.util.Comparator
import kotlin.Array
import kotlin.Boolean
import kotlin.BooleanArray
import kotlin.CharSequence
import kotlin.Comparable
import kotlin.Int
import kotlin.Pair
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.IndexedValue
import kotlin.collections.Iterable
import kotlin.collections.Iterator
import kotlin.collections.List
import kotlin.jvm.JvmInline
import kotlin.ranges.IntRange
import kotlin.sequences.Sequence

/**
 * Represents an array that cannot have its elements re-assigned.
 *
 * Although this is a class that wraps a regular array, it's really a zero-cost abstraction that
 * gets eliminated at compile time so that variables of this type end up pointing directly at the
 * underlying array.
 *
 * In order to preserve the same performance as regular arrays, all methods that delegate to the
 * same method on the backing array are marked with inline so that call sites end up calling the
 * underlying methods directly.  Note that this won't have any negative performance impacts as it
 * doesn't result in duplicate code or anything as it just replaces the wrapper method call with the
 * underlying method call.
 */
@Suppress("NOTHING_TO_INLINE")
@JvmInline
public value class ImmutableBooleanArray @PublishedApi internal constructor(
    /**
     * This is internal instead of private so we can have inline functions that delegate to the same
     * function on the backing array.  The backing array won't be accessible from Kotlin code since the
     * auto-generated arrays are in their own module and the internal modifier prevents outside access.
     *  The constructor is also internal preventing anyone from creating an "instance" that points to
     * an array that they have access to.
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
    internal val values: BooleanArray,
) {
    public inline val size: Int
        get() = values.size

    /**
     * Returns the index of the last element or -1 if the array is empty.
     */
    public inline val lastIndex: Int
        get() = values.lastIndex

    /**
     * Returns the range of valid indices for the array.
     */
    public inline val indices: IntRange
        get() = values.indices

    override fun toString(): String = values.joinToString(prefix = "[", postfix = "]")

    /**
     * See [BooleanArray.joinToString]
     */
    public fun joinToString(
        separator: CharSequence = ", ",
        prefix: CharSequence = "",
        postfix: CharSequence = "",
        limit: Int = -1,
        truncated: CharSequence = "...",
        transform: ((element: Boolean) -> CharSequence)? = null,
    ): String = values.joinToString(separator, prefix, postfix, limit, truncated, transform)

    public operator fun equals(other: ImmutableBooleanArray): Boolean {
        if (other.size != this.size) return false

        forEachIndexed { index, element ->
            if (other[index] != element) return false
        }
        return true
    }

    override fun hashCode(): Int {
        // Start with non-zero hash so that arrays that start with a different number of zero-hash elements end up with different hashCodes
        var hashCode = 7
        for (value in values) {
            hashCode = 31 * hashCode + value.hashCode()
        }
        return hashCode
    }

    /**
     * See [BooleanArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [BooleanArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public inline operator fun `get`(index: Int): Boolean = values[index]

    /**
     * See [BooleanArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Boolean? = values.getOrNull(index)

    public operator fun component1(): Boolean = get(0)

    public operator fun component2(): Boolean = get(1)

    public operator fun component3(): Boolean = get(2)

    public operator fun component4(): Boolean = get(3)

    public operator fun component5(): Boolean = get(4)

    /**
     * See [BooleanArray.single]
     */
    public inline fun single(): Boolean = values.single()

    /**
     * See [BooleanArray.single]
     */
    public inline fun single(predicate: (element: Boolean) -> Boolean): Boolean =
        values.single(predicate)

    /**
     * See [BooleanArray.singleOrNull]
     */
    public inline fun singleOrNull(): Boolean? = values.singleOrNull()

    /**
     * See [BooleanArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Boolean) -> Boolean): Boolean? =
        values.singleOrNull(predicate)

    /**
     * See [BooleanArray.first]
     */
    public inline fun first(): Boolean = values.first()

    /**
     * See [BooleanArray.first]
     */
    public inline fun first(predicate: (element: Boolean) -> Boolean): Boolean =
        values.first(predicate)

    /**
     * See [BooleanArray.firstOrNull]
     */
    public inline fun firstOrNull(): Boolean? = values.firstOrNull()

    /**
     * See [BooleanArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Boolean) -> Boolean): Boolean? =
        values.firstOrNull(predicate)

    /**
     * See [BooleanArray.last]
     */
    public inline fun last(): Boolean = values.last()

    /**
     * See [BooleanArray.last]
     */
    public inline fun last(predicate: (element: Boolean) -> Boolean): Boolean =
        values.last(predicate)

    /**
     * See [BooleanArray.lastOrNull]
     */
    public inline fun lastOrNull(): Boolean? = values.lastOrNull()

    /**
     * See [BooleanArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Boolean) -> Boolean): Boolean? =
        values.lastOrNull(predicate)

    /**
     * See [BooleanArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Boolean> = values.iterator()

    /**
     * See [BooleanArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Boolean> = values.asIterable()

    /**
     * See [BooleanArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Boolean>> = values.withIndex()

    /**
     * See [BooleanArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Boolean> = values.asSequence()

    /**
     * Wraps the backing array in a class that implements the read-only [List] interface by
     * referencing the same backing array without copying the elements.
     *
     * Note that [ImmutableBooleanArray] stores primitive values whereas [List] operates on generic
     * types so this will auto-box the value that is accessed on every access.  If the total number of
     * accesses is expected to be multiple times larger than the total number of elements then you
     * might want to consider converting it into a list instead as that will auto-box all the elements
     * only once at the cost of allocating a separate backing array.
     */
    public inline fun asList(): List<Boolean> = values.asList()

    /**
     * See [BooleanArray.forEach]
     */
    public inline fun forEach(action: (element: Boolean) -> Unit) {
        values.forEach(action)
    }

    /**
     * See [BooleanArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Boolean) -> Unit) {
        values.forEachIndexed(action)
    }

    /**
     * See [BooleanArray.all]
     */
    public inline fun all(predicate: (predicate: Boolean) -> Boolean): Boolean =
        values.all(predicate)

    /**
     * See [BooleanArray.any]
     */
    public inline fun any(predicate: (predicate: Boolean) -> Boolean): Boolean =
        values.any(predicate)

    /**
     * See [BooleanArray.none]
     */
    public inline fun none(predicate: (predicate: Boolean) -> Boolean): Boolean =
        values.none(predicate)

    /**
     * See [BooleanArray.count]
     */
    public inline fun count(predicate: (predicate: Boolean) -> Boolean): Int =
        values.count(predicate)

    /**
     * Creates a pair of immutable arrays, where the first contains elements for which predicate
     * yielded true, and the second contains the other elements.
     */
    public fun partition(predicate: (element: Boolean) -> Boolean): Pair<ImmutableBooleanArray, ImmutableBooleanArray> {
        val first = Builder()
        val second = Builder()
        for (element in values) {
            when (predicate(element)) {
                true -> first.add(element)
                else -> second.add(element)
            }
        }
        return Pair(first.build(), second.build())
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableBooleanArray with all elements
     * sorted according to the natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedBy(crossinline selector: (element: Boolean) -> R?): ImmutableBooleanArray {
        return sortedWith(compareBy(selector))
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableBooleanArray with all elements
     * sorted according to the reverse natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedByDescending(crossinline selector: (element: Boolean) -> R?): ImmutableBooleanArray {
        return sortedWith(compareByDescending(selector))
    }

    /**
     * Leaves this immutable array as is and returns an [ImmutableBooleanArray] with all elements
     * sorted according to the specified [comparator].
     */
    public fun sortedWith(comparator: Comparator<in Boolean>): ImmutableBooleanArray {
        // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
        if (size <= 1) return this

        val temp = values.toTypedArray()
        Arrays.sort(temp, comparator)
        return temp.toImmutableArray()
    }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableBooleanArray = ImmutableBooleanArray(BooleanArray(0))

        /**
         * Returns an ImmutableBooleanArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Boolean): ImmutableBooleanArray {
            if (size == 0) return EMPTY

            val backingArray = BooleanArray(size) { index -> init(index) }
            return ImmutableBooleanArray(backingArray)
        }
    }

    /**
     * Builder to construct immutable arrays when the resulting size isn't known in advance.
     *
     * @param initialCapacity The initial capacity of the temporary array where the values are
     * accumulated.  A larger value reduces the number of times it's resized as elements get added.
     */
    public class Builder(
        initialCapacity: Int = 10,
    ) {
        public var size: Int = 0
            private set

        private var values: BooleanArray = BooleanArray(initialCapacity)

        public fun add(element: Boolean): Builder {
            ensureCapacity(size + 1)
            values[size++] = element
            return this
        }

        /**
         * Adds the [element] to the builder.
         */
        public operator fun plusAssign(element: Boolean) {
            add(element)
        }

        public fun addAll(elements: BooleanArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: Array<Boolean>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: ImmutableBooleanArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements.values, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: ImmutableArray<Boolean>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: Iterable<Boolean>): Builder {
            if (elements is Collection) {
                ensureCapacity(size + elements.size)
                for (element in elements) {
                    values[size++] = element
                }
                return this
            }
            for (element in elements) {
                add(element)
            }
            return this
        }

        public fun addAll(elements: Sequence<Boolean>): Builder {
            elements.forEach { add(it) }
            return this
        }

        /**
         * Returns an immutable array containing the elements that were added.
         */
        public fun build(): ImmutableBooleanArray {
            when (size) {
                0 -> return EMPTY
                values.size -> return ImmutableBooleanArray(values)
            }
            val backingArray = BooleanArray(size)
            System.arraycopy(values, 0, backingArray, 0, size)
            return ImmutableBooleanArray(backingArray)
        }

        private fun ensureCapacity(minCapacity: Int) {
            val newCapacity = BuilderUtils.computeNewCapacity(values.size, minCapacity)
            if (newCapacity == values.size) return

            val replacement = BooleanArray(newCapacity)
            System.arraycopy(values, 0, replacement, 0, size)
            values = replacement
        }
    }
}
