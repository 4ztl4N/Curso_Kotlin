class EjeNulo {

    fun main(){
        var nombre: String? = null
        try {
            clase19(nombre)
        } catch (e: NullPointerException) {
            println("Valió: ${e.message}")
        } finally {
            println("acabó")
        }

        val primerValor = 10
        val segundoValor = 0
        var resultado = divzero(primerValor, segundoValor)
        println(resultado)
    }

    fun clase19(nombre: String?) {
        throw NullPointerException("Referencia nula")
    }

    fun divzero(primerValor: Int, segundoValor: Int): Int {
        val resultado: Int = try {
            primerValor / segundoValor
        } catch (exception: Exception) {
            0
        }
        return resultado
    }
}
