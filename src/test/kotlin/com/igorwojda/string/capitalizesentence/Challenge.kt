package com.igorwojda.string.capitalizesentence

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun capitalizeSentence(str: String): String {
    val separado = str.split(" ")
    var cap = separado.map { it.replaceFirstChar { c -> c.uppercaseChar() } }
    var resultado = cap.joinToString(" ")
    println(resultado)
    return resultado
}

private class Test {
    @Test
    fun `flower is capitalized to Flower`() {
        capitalizeSentence("flower") shouldBeEqualTo "Flower"
    }

    @Test
    fun `this is a house is capitalised to This Is A House`() {
        capitalizeSentence("this is a house") shouldBeEqualTo "This Is A House"
    }
}
