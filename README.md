# pods4k

## Performance-oriented data structures for Kotlin

A collection of performance-oriented data structures that provide performance and efficiency that might appear to be
impossible at first glance.

## Immutable Arrays

A safer and more efficient alternative to read-only lists providing the same type of capabilities and similar-looking
code.

Immutable arrays wrap regular arrays with zero-cost abstractions that get eliminated at compile-time. However, unlike
standard arrays, the array elements cannot be re-assigned, so immutable arrays can be safely shared without needing to
be wrapped in immutable collections:

```kotlin
val names = immutableArrayOf("Dan", "Bob")
println(names[0]) // Dan

names[1] = "Jane" // Compile error: No set method providing array access
```

On top of the base efficiency improvements when storing typical generic types, immutable arrays are even more efficient
when dealing with the 8 primitive types. The primitive variants of immutable arrays store primitive values in a compact
contiguous region of memory instead of auto-boxing each value and storing pointers to scattered wrapper objects like
what read-only lists do. For example, when storing integers, this reduces memory consumption by up to 7 times on a
64bit JVM and performance can improve by over 10 times when performing operations on these values in tight loops:

```kotlin
val people = immutableArrayOf(
    Person(name = "Dan", age = 3),
    Person(name = "Bob", age = 4),
) // ImmutableArray<Person>

// Mapping the ages automatically uses an efficient ImmutableIntArray[3, 4] storing primitive int values
val ages = people.map { it.age }
performStatisticalAnalysis(ages)
```

When mutability isn't needed, Immutable arrays are also a safer and cleaner alternative to regular arrays providing
significant efficiency improvements over regular arrays for dozens of common operations. See
[Immutable Arrays](immutable-arrays/README.md) for more specifics along with a detailed comparison against regular
arrays, read-only lists, and immutable lists.

## Java Compatibility

Automated tests are run on all the LTS JDK releases which are supported by Kotlin (JDK 8, 11, 17, etc.)

Some data structures use techniques which are only supported by the Kotlin compiler. While they can be used in a mixed
Java & Kotlin codebase to store one of these data structures in a Java-defined collection, referencing these data
structures by their class name is only supported within Kotlin files.
