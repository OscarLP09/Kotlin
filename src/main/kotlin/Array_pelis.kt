fun main(){
    val peliculas = listOf("Jumanji", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill")
    val largo = peliculas.maxByOrNull { it.length } // Saco la peli con el titulo más largo
    val indice = peliculas.indexOf(largo) // Saco el indice de la peli con el titulo más largo
    println(largo)
    println(indice)
}