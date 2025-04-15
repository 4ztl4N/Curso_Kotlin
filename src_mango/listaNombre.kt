class listaNombre {

    fun main() {
        val listaDeNombres = listOf<String>(
            "Juan",
            "Enrique",
            "Camila"
        )
        println(listaDeNombres)

        var listavacia = mutableListOf<String>()
        println(listavacia)
        listavacia.add("Jorge")
        println(listavacia)

        val ValorGet = listavacia.get(0)
        println(ValorGet)

        val ValorOperador = listavacia[0]
        println(ValorOperador)

        val primerValor: String? = listaDeNombres.firstOrNull()
        println(primerValor)

        listavacia.removeAt(0)
        println(listavacia)

        listavacia.add("Miros")
        println(listavacia)

        listavacia.removeIf { caracteres -> caracteres.length > 3 }
        println(listavacia)

        val myArray = arrayOf()
    }
}