fun main(){
    println("Inserte una cantidad en mg: ")
    var cantidad = readLine()!!.toInt()

    if (cantidad > 100){
        println("¡Felicidades, es una buena poción!")
    }else{
        println("La poción es mediocre, sangre sucia inmunda")
    }
}