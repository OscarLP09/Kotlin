fun main(){
    print("Introduzca la distancia del conductor en km: ")
    var distancia = readLine()!!.toFloat()
    print("Responda con true o false la disponibilidad del conductor: ")
    var disponibilidad = readLine()!!.toBoolean()

    if(distancia <= 0.5 && disponibilidad == true){
        println("Listo para iniciar recorrido")
    }else if(distancia <= 0.5 && disponibilidad == false){
        println("Conductor cercano, pero no disponible")
    }else if(distancia > 0.5 && disponibilidad == true){
        println("Conductor disponible pero muy lejos, aplicarán tarifas más altas")
    }else if(distancia > 0.5 && disponibilidad == false){
        println("No hay conductores disponibles")
    }else{
        println("Introduzca números válidos")
    }
}