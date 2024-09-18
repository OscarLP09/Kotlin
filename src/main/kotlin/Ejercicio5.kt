fun main(){
    println("¿Cómo es el clima de hoy? ")
    var numero=readLine()!!.toInt()

    when(numero){
        1 -> println("Soleado")
        2 -> println("Nublado")
        3 -> println("Lluvioso")
        4 -> println("Tormentoso")
        5 -> println("Nevado")
        else -> println("Pregúntale a Google")
    }
}
