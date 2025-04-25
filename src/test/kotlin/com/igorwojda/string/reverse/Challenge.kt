package com.igorwojda.string.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(str: String): String {
    val palabra: MutableList<Char> = mutableListOf()
    val j = str.length - 1
    for (i in j downTo 0) {
        palabra.add(str[i])
    }
    val resultado = palabra.joinToString("")
    return resultado
}

private class Test {
    @Test
    fun `Reverse of 'abcd' is 'dcba'`() {
        reverse("abcd") shouldBeEqualTo "dcba"
    }

    @Test
    fun `Reverse of 'aabbccdd' is 'ddccbbaa'`() {
        reverse("aabbccdd") shouldBeEqualTo "ddccbbaa"
    }
}
