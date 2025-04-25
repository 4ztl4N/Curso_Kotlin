package com.igorwojda.string.surroundedletter

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun surroundedLetter(str: String): Boolean {
    if (str.length < 3) return false
    val regex = Regex("\\+[a-zA-Z]\\+")
    for (i in str.indices) {
        if (str[i].isLetter()) {
            val inicio = (i - 1).coerceAtLeast(0)
            val final = (i + 1).coerceAtMost(str.lastIndex)
            val ejemplo = str.substring(inicio..final)
            println(ejemplo)
            if (ejemplo.matches(regex)) {
                println("")
            } else {
                return false
            }
        }
    }
    return true
}

private class Test {
    @Test
    fun `'a' return 'false'`() {
        surroundedLetter("a") shouldBeEqualTo false
    }

    @Test
    fun `'+a+' return 'true'`() {
        surroundedLetter("+a+") shouldBeEqualTo true
    }

    @Test
    fun `'a+' return 'false'`() {
        surroundedLetter("a+") shouldBeEqualTo false
    }

    @Test
    fun `'+a' return 'false'`() {
        surroundedLetter("+a") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b+' return 'true'`() {
        surroundedLetter("+a+b+") shouldBeEqualTo true
    }

    @Test
    fun `'+a++b+' return 'true'`() {
        surroundedLetter("+a++b+") shouldBeEqualTo true
    }

    @Test
    fun `'+ab+' return 'false'`() {
        surroundedLetter("+ab+") shouldBeEqualTo false
    }

    @Test
    fun `'a+b+' return 'false'`() {
        surroundedLetter("a+b+") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b' return 'false'`() {
        surroundedLetter("+a+b") shouldBeEqualTo false
    }

    @Test
    fun `'+a+b+++c++d+e++' return 'true'`() {
        surroundedLetter("+a+b+++c++d+e++") shouldBeEqualTo true
    }

    @Test
    fun `'+++a+d++de++e++' return 'false'`() {
        surroundedLetter("+a+d++de++e+") shouldBeEqualTo false
    }

    @Test
    fun `'+++aaa+d++de+f+e++' return 'false'`() {
        surroundedLetter("+++aaa+d++de+f+e++") shouldBeEqualTo false
    }
}
