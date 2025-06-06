package com.igorwojda.list.largestelements

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import java.util.*
import java.util.PriorityQueue

private fun largestElements(list: List<Int>, count: Int): List<Int> {
    if (count >= list.size) return list

    return list
        .sorted()
        .windowed(count)
        .maxBy { it.sum() }
        .toList()
}

private class Test {
    @Test
    fun `3 largest elements`() {
        val list = listOf(5, 1, 3)

        largestElements(list, 3) shouldBeEqualTo listOf(5, 1, 3)
    }

    @Test
    fun `2 largest elements`() {
        val list = listOf(5, 1, 3)

        largestElements(list, 2) shouldBeEqualTo listOf(3, 5)
    }

    @Test
    fun `1 largest element`() {
        val list = listOf(5, 1, 3)

        largestElements(list, 1) shouldBeEqualTo listOf(5)
    }
}
