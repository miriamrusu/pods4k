package com.danrusu.pods4k.immutableArrays

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isA
import strikt.assertions.isEqualTo

private val primitiveShortClass = 3.toShort()::class.java

/**
 * IMPORTANT:
 * Read TESTING-STRATEGY.md before modifying this file.
 */
class ImmutableShortArrayTest {
    @Test
    fun `ensure that primitive class variable is correct`() {
        expectThat(primitiveShortClass.toString()).isEqualTo("short")
    }

    @Test
    fun `creation validation`() {
        expectThat(ImmutableShortArray(1) { it.toShort() })
            .isA<ImmutableShortArray>()
    }

    @Test
    fun `get validation`() {
        with(ImmutableShortArray(1) { it.toShort() }) {
            expectThat(get(0)::class.java).isEqualTo(primitiveShortClass)
        }
    }

    @Test
    fun `iterator validation`() {
        with(ImmutableShortArray(3) { it.toShort() }) {
            for (value in this) {
                expectThat(value::class.java).isEqualTo(primitiveShortClass)
            }
        }
    }
}