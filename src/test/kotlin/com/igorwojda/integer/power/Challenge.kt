package com.igorwojda.integer.power

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun power(base: Int, exponent: Int): Int {
    var resultado: MutableList<Int> = mutableListOf()
    if (base > 0 && exponent > 0) {
        for (i in 1..exponent)
            resultado.add(base)
    }
    println(resultado)
    return resultado.reduce { acc, i -> acc * i }
}


private class Test {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldBeEqualTo 2
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldBeEqualTo 4
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldBeEqualTo 8
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldBeEqualTo 81
    }
}
