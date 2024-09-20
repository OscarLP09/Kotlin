fun main(){
    println("¿Cuál es el clima de hoy?")
    var clima = readLine()!!.toInt()

    println(when (clima) {
        1 -> "Soleado"
        2 -> "Nublado"
        3 -> "Lluvioso"
        4 -> "Tormentoso"
        5 -> "Nevado"
        else -> "Pregúntale a Google"
    }
    )
}