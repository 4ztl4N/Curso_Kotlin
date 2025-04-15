
class Structif {

    operator fun invoke(nombre: String){

        if(nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") else println("Error, la variable está vacía")

        val mensaje : String = if (nombre.length > 4) {
            "Tu nombre es largo"
        } else if(nombre.isEmpty()) {
            "El nombre está vacío"
        } else {
            "Tienes un nombre corto"
        }
        println(mensaje)
    }
}