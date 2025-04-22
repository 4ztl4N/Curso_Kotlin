package com.igorwojda.string.issubstring

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isSubstring(str: String, subStr: String): Boolean {
    if (subStr.isEmpty()) return true

    val prefijo = str.commonPrefixWith(subStr)
    val sufijo = str.commonSuffixWith(subStr)

    if (sufijo == subStr) return true
    if (prefijo == subStr) return true

    val builder = StringBuilder()
    var j = 0
    for (i in str.indices) {
        if (str[i] == subStr[j]) {
            builder.append(str[i])
            j++

        } else continue
    }

    if (builder.toString() == subStr) {
        return true
    }
    return false
}


private class Test {
    @Test
    fun `abd not in abcd`() {
        isSubstring("abcd", "abd") shouldBeEqualTo false
    }

    @Test
    fun `e not in abcd`() {
        isSubstring("abcd", "e") shouldBeEqualTo false
    }

    @Test
    fun `ab in abc`() {
        isSubstring("abc", "ab") shouldBeEqualTo true
    }

    @Test
    fun `bc in abc`() {
        isSubstring("abc", "bc") shouldBeEqualTo true
    }

    @Test
    fun `abc in abc`() {
        isSubstring("abc", "abc") shouldBeEqualTo true
    }

    @Test
    fun `abc in aaababcd`() {
        isSubstring("aaababcd", "abc") shouldBeEqualTo true
    }

    @Test
    fun `abc not in aaababab`() {
        isSubstring("aaababab", "abc") shouldBeEqualTo false
    }

    @Test
    fun `aab in aaab`() {
        isSubstring("aaab", "aab") shouldBeEqualTo true
    }

    @Test
    fun `abc in ababc`() {
        isSubstring("ababc", "abc") shouldBeEqualTo true
    }

    @Test
    fun `cd in abcdef`() {
        isSubstring("abcdef", "cd") shouldBeEqualTo true
    }

    @Test
    fun `empty sub-string not in abc`() {
        isSubstring("abc", "") shouldBeEqualTo true
    }

    @Test
    fun `abc not in empty string`() {
        isSubstring("", "abc") shouldBeEqualTo false
    }

    @Test
    fun `empty sub-string not in empty string`() {
        isSubstring("", "") shouldBeEqualTo true
    }
}
