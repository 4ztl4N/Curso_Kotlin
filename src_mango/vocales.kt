class vocales {

    fun contarVocalesYConsonantes(palabra: String): Pair<Int, Int> {
        var vocales = 0
        var consonantes = 0

        for (letra in palabra) {
            if (letra.isLetter()) {
                if (letra.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')) {
                    vocales++
                } else {
                    consonantes++
                }
            }
        }
        return Pair(vocales, consonantes)
    }

    fun main() {
        val palabra = "Miros"
        val (v, c) = contarVocalesYConsonantes(palabra)
        println("En \"$palabra\" hay $v vocal(es) y $c consonante(s).")
    }
}