class apuntes {
    fun ShowPersons(vararg personas:String){
        (0..personas.size-1).forEach{ num ->
            println(personas[num])
        }
    }
    fun showPersons(vararg personas:String){
        for(persona in personas){
            println(persona)
        }
    }
    fun Main(){
        showPersons("Pepe", "Luis")
        ShowPersons("Paco", "Juan", "Alberto")
    }
}