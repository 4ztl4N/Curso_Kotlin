package com.igorwojda.integer.pyramidgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import org.junit.platform.commons.util.ToStringBuilder
import kotlin.contracts.Returns

fun generatePyramid(n: Int): List<String> {
    if (n == 1) {
        return listOf("#")
    }

    val pre: MutableList<Int> = mutableListOf(1)
    for (i in 2..n) {
        pre.add(i + 2)
    }

    val result = pre.map { gatitos ->
        val rowBuilder = StringBuilder()
        for (i in gatitos downTo 1 ){
            rowBuilder.append("#")
        }
        val row = rowBuilder.toString()
        println(row)
        row
    }
    return result
}

private class Test {

    @Test
    fun `pyramid n = 2`() {
        generatePyramid(2).also {
            it.size shouldBeEqualTo 2
            it[0] shouldBeEqualTo " # "
            it[1] shouldBeEqualTo "###"
        }
    }

    @Test
    fun `pyramid n = 3`() {
        generatePyramid(3).also {
            it.size shouldBeEqualTo 3
            it[0] shouldBeEqualTo "  #  "
            it[1] shouldBeEqualTo " ### "
            it[2] shouldBeEqualTo "#####"
        }
    }

    @Test
    fun `pyramid n = 4`() {
        generatePyramid(4).also {
            it.size shouldBeEqualTo 4
            it[0] shouldBeEqualTo "   #   "
            it[1] shouldBeEqualTo "  ###  "
            it[2] shouldBeEqualTo " ##### "
            it[3] shouldBeEqualTo "#######"
        }
    }
}
