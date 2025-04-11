class Strucwhen {

    operator fun invoke(nombreColor: String) {

        when (nombreColor) {
            "Amarillo" -> println("El amarillo es el color de la alegrìa")
            "Rojo" -> println("Este color simboliza el calor")
            "Carmesí" -> println("Este color simboliza el calor")
            else -> println("Error, no tengo informaciòn del color")
        }
    }

    fun caso2(code: Int) {
        when (code) {
            in 200..299 -> println("Todo ha ido bien")
            in 400..500 -> println("Algo ha fallado")
            else -> println("Código desconocido, algo ha fallado")
            }

        }
    fun caso3(tallaZapato: Int) {
        val mensaje = when(tallaZapato){
            24, 25 -> "Tenemos disponible"
            26, 27 -> "Casi no nos quedan"
            28, 29 -> "Lo siento, no tenemos disponible"
            else -> "Estos zapatos solo vienen en tallas 24, 25, 26, 27, 28 y 29"
        }
        println(mensaje)
            }

    }