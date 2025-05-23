package com.igorwojda.list.coins

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun getCoins(amount: Int, coins: List<Int>): Int {
    if (amount == 0) return 1
    if (coins.isEmpty()) return 0

    val resultados = mutableListOf<List<Int>>()
    val pila = ArrayDeque<Triple<List<Int>, Int, Int>>()
    val nums = coins.sorted()
    pila.add(Triple(emptyList(), 0, 0))

    while (pila.isNotEmpty()) {
        val (combinacion, suma, index) = pila.removeLast()

        if (suma == amount) {
            resultados.add(combinacion)
            continue
        }

        for (i in index until nums.size) {
            val numero = nums[i]
            val nuevaSuma = suma + numero

            if (nuevaSuma > amount) break

            pila.add(Triple(combinacion + numero, nuevaSuma, i))
        }
    }

    return resultados.count()

}

private class Test {
    @Test
    fun `4 wys`() {
        val actual: Int = getCoins(4, listOf(1, 2, 3))
        val expected = 4
        actual shouldBeEqualTo expected
    }

    @Test
    fun `one way`() {
        val actual: Int = getCoins(0, listOf(1, 2))
        val expected = 1
        actual shouldBeEqualTo expected
    }

    @Test
    fun `no coins returns 0`() {
        val actual: Int = getCoins(1, listOf())
        val expected = 0
        actual shouldBeEqualTo expected
    }

    @Test
    fun `big coins`() {
        val actual: Int = getCoins(5, listOf(25, 50))
        val expected = 0
        actual shouldBeEqualTo expected
    }

    @Test
    fun `big amount`() {
        val actual: Int = getCoins(50, listOf(5, 10))
        val expected = 6
        actual shouldBeEqualTo expected
    }

    @Test
    fun `a lot of change`() {
        val actual: Int = getCoins(100, listOf(1, 5, 10, 25, 50))
        val expected = 292
        actual shouldBeEqualTo expected
    }
}
