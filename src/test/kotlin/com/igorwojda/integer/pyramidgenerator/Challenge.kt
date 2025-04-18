package com.igorwojda.integer.pyramidgenerator

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import org.junit.platform.commons.util.ToStringBuilder
import kotlin.contracts.Returns

fun generatePyramid(n: Int): List<String> {
    val gatitos: MutableList<Int> = mutableListOf(1)

    if (n == 1) {
        return listOf("#")
    }

    for (i in 1..<n) {
        gatitos.add(1 + i * 2)
    }

    val result = gatitos.map { gato ->
        val rowBuilder = StringBuilder()
        val espacio = (gatitos.last() - gato) / 2
        //println("Row -> Gatitos: $gato Espacios = $espacio")
        repeat(espacio) {
            rowBuilder.append(" ")
        }
        for (i in gato downTo 1) {
            rowBuilder.append("#")
        }
        repeat(espacio) {
            rowBuilder.append(" ")
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

    @Test
    fun `pyramid n = 5`() {
        generatePyramid(5).also {
            it.size shouldBeEqualTo 5
            it[0] shouldBeEqualTo "    #    "
            it[1] shouldBeEqualTo "   ###   "
            it[2] shouldBeEqualTo "  #####  "
            it[3] shouldBeEqualTo " ####### "
            it[4] shouldBeEqualTo "#########"
        }
    }
}
