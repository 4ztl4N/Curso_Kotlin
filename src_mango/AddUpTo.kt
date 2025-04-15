class AddUpTo {

    fun main() {
        addUpTo(n = 5)
        addUpTo(n = 2)
        addUpTo(n = 4)
        addUpTo(n = 9)
    }

    // genera una funcion llamada "addUpTo" que devuelva la suma de todos los numeros anteriores incluyendo n
    // ej:  addUpTo(5) = 5+4+3+2+1 = 15

    fun addUpTo(n: Int): Int {
        var x = 0
        for (i in 0..n) {
            x += i
        }
        println(x)
        return x
    }
}