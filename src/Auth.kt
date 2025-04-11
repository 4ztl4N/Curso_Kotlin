class Auth {
    private val realUser: Int = 5
    private val realPassword: Int = 30

    fun login(user: Int, password: Int): Boolean {
        if(realUser != user){
            println("Usario incorrecto")
            return false
        }

        if(realPassword != password){
            println("Contraseña incorrecta")
            return false
        }

        println("Te has logueado satisfactoriamente")
        return true
    }

    private fun validateUser(word: String): Boolean {
        return word.length < 5
    }
}