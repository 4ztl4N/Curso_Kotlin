package com.igorwojda.integer.generateallpairs

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    val respuesta: MutableList<Pair<Int,Int>> = mutableListOf()
    for (comb1 in 0..n){
        for (comb2 in 0..n) {
            var pares = Pair(comb1,comb2)
            respuesta.add(pares)
            println(pares)
        }
    }
    return respuesta
}

private class Test {
    @Test
    fun `get all pairs 0`() {
        getAllPairs(0) shouldBeEqualTo listOf(0 to 0)
    }

    @Test
    fun `get all pairs 1`() {
        getAllPairs(1) shouldBeEqualTo listOf(
            0 to 0,
            0 to 1,
            1 to 0,
            1 to 1,
        )
    }

    @Test
    fun `get all pairs 2`() {
        getAllPairs(2) shouldBeEqualTo listOf(
            0 to 0,
            0 to 1,
            0 to 2,
            1 to 0,
            1 to 1,
            1 to 2,
            2 to 0,
            2 to 1,
            2 to 2,
        )
    }
}
