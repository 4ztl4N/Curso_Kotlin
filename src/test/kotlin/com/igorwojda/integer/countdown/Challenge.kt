package com.igorwojda.integer.countdown

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun countDown(n: Int): List<Int> {
    var resultado: MutableList<Int> = mutableListOf()
    for (i in n downTo 0 step 1) {
        resultado.add(i)
    }
    println(resultado)
    return resultado
}

private class Test {
    @Test
    fun `count down 0`() {
        countDown(0) shouldBeEqualTo mutableListOf(0)
    }

    @Test
    fun `count down 1`() {
        countDown(1) shouldBeEqualTo mutableListOf(1, 0)
    }

    @Test
    fun `count down 5`() {
        countDown(5) shouldBeEqualTo mutableListOf(5, 4, 3, 2, 1, 0)
    }
}
