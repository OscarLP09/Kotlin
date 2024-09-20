fun main(){
    // Bucle For
    /*
    print("Introduzca un número: ")
    var n = readLine()!!.toInt()   // Lee un número del usuario y lo convierte a un entero
    var suma = 0   // Inicializa una variable para almacenar la suma

    for(i in 1..n){  // Bucle que va desde 1 hasta 'n' (inclusive)
        suma += i   // En cada iteración, suma el valor de 'i' a 'suma'
    }
    print("La suma es $suma")   // Imprime el resultado final de la suma
    */

    // Bucle While
    print("Introduzca un número: ")
    var n = readLine()!!.toInt()   // Lee otro número del usuario y lo convierte a un entero
    var suma = 0   // Reinicia la variable suma

    while(n > 0) {   // Mientras 'n' sea mayor que 0
        suma += n   // Suma el valor actual de 'n' a 'suma'
        n--   // Decrementa el valor de 'n' en 1
    }
    println("La suma es $suma")   // Imprime el resultado final de la suma

}