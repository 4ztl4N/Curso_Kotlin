class Strucwhile {

    fun clase15(contador: Int) {
        var contadorReal = contador
        while (contadorReal > 0) {
            println("El valor del contador es $contadorReal")
            contadorReal--


        }
    }

    fun clasedowhlie() {
        do {
            println("Generando número aleatorio")
            val numeroAleatorio = (0..100).random()
            println("El nùmero generado es $numeroAleatorio")
        } while (numeroAleatorio > 50)
    }
}
