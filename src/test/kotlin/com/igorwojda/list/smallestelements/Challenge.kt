package com.igorwojda.list.smallestelements

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun smallestElements(list: List<Int>, count: Int): List<Int> {
    if (list.size < count) return list
    val resultado =  list.windowed(count,1).minBy { it.sum() }
    println(resultado)
    return resultado
    }


private class Test {
    @Test
    fun `4 smallest elements`() {
        val list = listOf(5, 1, 3)

        smallestElements(list, 3) shouldBeEqualTo listOf(5, 1, 3)
    }

    @Test
    fun `3 smallest elements`() {
        val list = listOf(5, 1, 3)

        smallestElements(list, 3) shouldBeEqualTo listOf(5, 1, 3)
    }

    @Test
    fun `2 smallest elements`() {
        val list = listOf(5, 1, 3)

        smallestElements(list, 2) shouldBeEqualTo listOf(1,3)
    }

    @Test
    fun `1 smallest element`() {
        val list = listOf(5, 1, 3)

        smallestElements(list, 1) shouldBeEqualTo listOf(1)
    }
}
