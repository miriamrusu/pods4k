## Immutable Arrays

A safer and more efficient alternative to read-only lists providing the same type of capabilities and similar-looking
code (see [Benefits over read-only lists](#benefits-over-read-only-lists)).

When mutability isn't needed, Immutable arrays are also a safer and cleaner alternative to regular arrays
providing significant efficiency improvements over regular arrays for dozens of common operations
(see [Benefits over regular arrays](#benefits-over-regular-arrays)).

Immutable arrays wrap regular arrays with zero-cost abstractions that get eliminated at compile-time. This results in
regular arrays in the generated bytecode along with specialized code inserted by the Kotlin compiler depending on the
operations being performed. Unlike regular arrays, the immutable-array elements cannot be re-assigned, so immutable
arrays can be safely shared without needing to be wrapped in immutable collections:

```kotlin
val names = immutableArrayOf("Dan", "Bob")
println(names[0]) // Dan

names[1] = "Jane" // Compile error: No set method providing array access
```

### Benefits over regular arrays

<details>
<summary>Meaningful toString()</summary>

Unlike regular arrays, calling toString() on immutable arrays produces a pretty representation of the data:

```kotlin
println(immutableArrayOf("Dan", "Bob")) // [Dan, Bob]  Nice!
println(arrayOf("Dan", "Bob")) // [Ljava.lang.String;@7d4991ad  Yuck!
```

</details>

<details>
<summary>Efficient sharing of encapsulated data</summary>

Regular arrays can have their elements reassigned making them a poor choice for encapsulated data that's occasionally
shared. Using an array forces us to duplicate the contents into a collection before sharing so that callers can't
mutate the encapsulated array. This negatively affects performance and adds extra pressure on the garbage collector.
Immutable arrays can be safely shared resulting in cleaner and more efficient code.
</details>

<details>
<summary>Efficient transformations</summary>

Regular arrays are usually chosen for memory or performance reasons, however these benefits are negated when performing
dozens of typical transformations:

```kotlin
val weights = doubleArrayOf(1.5, 3.0, 10.2, 15.7, 2.0)
val interestingWeights = weights.filter { it > 10.0 }
// Oops, all our effort is in vain as this results in a 
// List<Double> auto-boxing each resulting value!
```

Unlike regular arrays, all operations on immutable arrays produce the most efficient type so that clean code is
efficient by default:

```kotlin
val people = immutableArrayOf(
    Person(name = "Dan", age = 3),
    Person(name = "Bob", age = 4),
) // ImmutableArray<Person>

// Mapping the ages automatically uses an efficient ImmutableIntArray[3, 4] storing primitive int values
val ages = people.map { it.age }
performStatisticalAnalysis(ages)
```

Here's a non-exhaustive list of operations that benefit from this significant efficiency improvement (some of these will
be added in future releases):

* map
* mapNotNull
* mapIndexed
* flatMap
* flatMapIndexed
* groupBy
* filter
* filterIndexed
* filterNot
* filterNotNull
* take
* takeWhile
* takeLast
* takeLastWhile
* drop
* dropWhile
* dropLast
* dropLastWhile
* reversed
* sorted
* sortedWith
* sortedBy
* sortedDescending
* sortedByDescending
* partition
* slice
* distinct
* distinctBy
* etc.

</details>

<details>
<summary>Avoids equality & hashCode defects</summary>

Unlike regular arrays, Immutable arrays have a proper equals & hashCode implementation allowing us to compare them in
the same way that we compare lists:

```kotlin
// Yes, this condition will be true when the immutable arrays have identical contents
if (immutableArrayOf(1, 2) == immutableArrayOf(1, 2)) ...
```

Since we can compare 2 lists directly, developers occasionally attempt to do the same thing with regular arrays
resulting in subtle defects:

```kotlin
// For a real codebase, imagine these were retrieved from somewhere else
val previousValues = arrayOf(1, 2)
val currentValues = arrayOf(1, 2)
// Oops, this condition will be false even though the arrays have identical contents
if (previousValues == currentValues) ...
```

The defects can be even more subtle:

```kotlin
data class Order(val id: Long, private val products: Array<Product>)

val rejectedOrders = mutableSetOf<Order>()
// Oops, attempting to add Orders to a hashSet will make use of the auto-generated 
// equals & hashCode methods from the Order data class which will in turn rely on 
// the defective equals & hashCode implementation of regular arrays
```

</details>

### Benefits over read-only lists

### Benefits over immutable lists

### Caveats