package com.igorwojda.list.pairaverage

import com.igorwojda.common.anycallback.anyCallback
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun hasAverage(list: List<Int>, average: Double): Boolean {
    if (list.size < 2) return false

    val pares = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            pares.add(Pair(list[i], list[j]))
        }
    }
    val promedios = pares.map { (a, b) -> listOf(a, b).average() }
    if (promedios.any { it == average }) {
        return true
    }
    return false
}

private class Test {
    @Test
    fun `empty list return false`() {
        hasAverage(listOf(), 1.0) shouldBeEqualTo false
    }

    @Test
    fun `list size 1 return false`() {
        hasAverage(listOf(1), 1.0) shouldBeEqualTo false
    }

    @Test
    fun `list 3, 5 should with average 5,5 return true`() {
        hasAverage(listOf(3, 5), 5.5) shouldBeEqualTo false
    }

    @Test
    fun `list 3, 4, 7, 9 should with average 6,5 return true`() {
        hasAverage(listOf(3, 4, 7, 9), 6.5) shouldBeEqualTo true
    }

    @Test
    fun `list 3, 5 should with average 2,7 return true`() {
        hasAverage(listOf(3, 5), 2.7) shouldBeEqualTo false
    }

    @Test
    fun `list 3, 5, 9, 7, 11, 14 should with average 8,0 return true`() {
        hasAverage(listOf(3, 5, 9, 7, 11, 14), 8.0) shouldBeEqualTo true
    }

    @Test
    fun `list 3, 7, 5 should with average 3,5 return true`() {
        hasAverage(listOf(3, 5, 7), 3.5) shouldBeEqualTo false
    }
}
