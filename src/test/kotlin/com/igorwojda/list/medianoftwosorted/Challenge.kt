package com.igorwojda.list.medianoftwosorted

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

fun medianOfSortedLists(list1: List<Int>, list2: List<Int>): Double {
    val listaUnica = list1
        .plus(list2)
        .sorted()

    val tamañoIndice = (listaUnica.size / 2)

    if (listaUnica.size % 2 == 1) {
        val resultadoImpar = listaUnica[tamañoIndice].toDouble()
        return resultadoImpar
    } else {
        val resultado = (listaUnica[tamañoIndice - 1] + listaUnica[tamañoIndice].toDouble()) / 2
        return resultado
    }
}

private class Test {
    @Test
    fun `median of sorted lists 1, 3 and 2 returns 2,0`() {
        medianOfSortedLists(listOf(1, 3), listOf(2)) shouldBeEqualTo 2.0
    }

    @Test
    fun `median of sorted lists 1, 2 and 3,4 returns 2,5`() {
        medianOfSortedLists(listOf(1, 2), listOf(3, 4)) shouldBeEqualTo 2.5
    }

    @Test
    fun `median of sorted lists 2 and 1, 3 returns 2,0`() {
        medianOfSortedLists(listOf(2), listOf(1, 3)) shouldBeEqualTo 2.0
    }

    @Test
    fun `median of sorted lists 1, 5, 7 and 2 returns 3,5`() {
        medianOfSortedLists(listOf(1, 5, 7), listOf(2)) shouldBeEqualTo 3.5
    }

    @Test
    fun `median of sorted lists 2 and 1, 6, 7 returns 4,0`() {
        medianOfSortedLists(listOf(2), listOf(1, 6, 7)) shouldBeEqualTo 4.0
    }

    @Test
    fun `median of sorted lists 1,2,3 and 1, 6, 7 returns 4,0`() {
        medianOfSortedLists(listOf(1, 2, 3), listOf(1, 6, 7)) shouldBeEqualTo 2.5
    }


    @Test
    fun `median of sorted lists 2,7,9 and 1, 6,7,8 returns 6,5`() {
        medianOfSortedLists(listOf(2, 7, 9), listOf(1, 6, 7, 8)) shouldBeEqualTo 7.0
    }
}
