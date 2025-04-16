package com.igorwojda.integer.fizzbuzz

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fizzBuzz(n: Int): List<String> {
    val lista: MutableList<String> = mutableListOf()
    (1..n).forEach {
        when {
            it % 5 == 0 && it % 3 == 0 -> lista.add("FizzBuzz")
            it % 3 == 0 -> lista.add("Fizz")
            it % 5 == 0 -> lista.add("Buzz")
            else -> lista.add(it.toString())
        }
        /*if (it % 15 == 0) {
            lista.add("FizzBuzz")
        } else if (it % 5 == 0) {
            lista.add("Buzz")
        } else if (it % 3 == 0) {
            lista.add("Fizz")
        } else {
            lista.add(it.toString())
        }*/
    }
    println(lista)
    return lista
}

private class Test {

    @Test
    fun `Calling fizzbuzz with 5 returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {
        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16",
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}
