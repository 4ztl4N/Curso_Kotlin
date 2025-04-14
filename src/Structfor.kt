class Structfor {

    fun clase16(listaFrutas: List<String>) {
        for (fruta in listaFrutas) println("Hoy voy a comerme la fruta $fruta.")
        listaFrutas.forEach { fruta ->
            println("Hoy voy a comerme una fruta nueva llamada $fruta.")
            }
        val caracteresFrutas: List<Int> = listaFrutas.map { fruta -> fruta.length }
        println(caracteresFrutas)
        val listafiltrada = caracteresFrutas.filter { largoFruta -> largoFruta > 5 }
        println(listafiltrada)
    }
}