package com.igorwojda.string.hasrepeatedcharacter

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test


private fun hasRepeatedChar(str: String): Boolean {
    val grupo = str.groupingBy { it }.eachCount().toList()
    val filtro = grupo.filter { it.second > 1 }.map { it.first }
    return filtro.isNotEmpty()

}

private class Test {
    @Test
    fun `'abc' don't have repeated character`() {
        hasRepeatedChar("abc") shouldBeEqualTo false
    }

    @Test
    fun `'aabc' has repeated character`() {
        hasRepeatedChar("aabc") shouldBeEqualTo true
    }

    @Test
    fun `'aabcc' has repeated character`() {
        hasRepeatedChar("aabcc") shouldBeEqualTo true
    }
}
