class Elvis {
    fun main() {
        var nombre: String? = null
        val carateresNombre : Int = nombre?.length ?: 0
        println("EL largo del nombre $nombre es $carateresNombre")
    }
}