package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPermutationPalindrome(str: String): Boolean {
    val frequency = str.groupingBy { it }.eachCount()
    val filtrado = frequency.filter { (_, valor) -> valor % 2 != 0 }

    if (filtrado.size > 1) {
        return false
    }
    return true
}


private class Test {
    @Test
    fun `'gikig' is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `'ookvk' is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `'sows' is not a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `'tami' is not a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }

    @Test
    fun `'kaaaak' is a palindrome`(){
        isPermutationPalindrome("kaaaak") shouldBeEqualTo true
    }

    @Test
    fun `'kaaak' is a palindrome`(){
        isPermutationPalindrome("kaaak") shouldBeEqualTo true
    }

    @Test
    fun `'kkkaaak' is a palindrome`(){
        isPermutationPalindrome("kkkaaak") shouldBeEqualTo true
    }
}
