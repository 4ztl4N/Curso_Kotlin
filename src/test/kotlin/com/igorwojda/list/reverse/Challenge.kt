package com.igorwojda.list.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(list: List<String>): List<String> {
    var resultado: MutableList<String> = mutableListOf()
    for (index in list.size - 1 downTo 0) {
        resultado.add(list[index])
    }
    return resultado
}

private class Test {
    @Test
    fun `reverse empty`() {
        val list = listOf<String>()
        reverse(list) shouldBeEqualTo listOf<String>()
    }

    @Test
    fun `reverse a`() {
        val list = listOf("a")
        reverse(list) shouldBeEqualTo listOf("a")
    }

    @Test
    fun `reverse even list`() {
        val list = listOf("a", "b")
        reverse(list) shouldBeEqualTo listOf("b", "a")
    }

    @Test
    fun `reverse odd list`() {
        val list = listOf("a", "b", "c")
        reverse(list) shouldBeEqualTo listOf("c", "b", "a")
    }
}
