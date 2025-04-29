package com.igorwojda.playground

import org.junit.jupiter.api.Test

fun String.randomCase(): String {
    val resultadoAlearorio = (0..99).random()
    return if (resultadoAlearorio.rem(2) == 0) {
        this.uppercase()
    } else {
        this.lowercase()
    }
}


class Something_Test {

    @Test
    fun `case A of Main`() {
        val fraseAleatoria = "En Platzi nunca paramos de aprender"
        val fraseOrdenada = fraseAleatoria.randomCase()
        println(fraseOrdenada)
    }
}