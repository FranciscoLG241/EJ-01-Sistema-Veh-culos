open class Vehiculo(val marca: String, val modelo: String, val capacidad: Int) {


    open fun mostrarInformacion(): String{
        return "El vehículo es de la marca $marca, modelo $modelo y su capacidad es de $capacidad"

    }


    open fun calcularAutonomia(): Int{
        return capacidad * 10
    }

}


class Automovil(marca: String, modelo: String, capacidad: Int, val tipo: String) : Vehiculo(marca, modelo, capacidad) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }

    override fun mostrarInformacion(): String {
        return super.mostrarInformacion() + " Es un automóvil tipo $tipo."
    }
}



class Motocicleta(marca: String, modelo: String, capacidad: Int, val cilindrada: Int): Vehiculo(marca, modelo, capacidad){

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }

    override fun mostrarInformacion(): String {
        return super.mostrarInformacion() + " Tiene una cilindrada de $cilindrada cc."
    }

}



fun main(){

    val vehiculo1 = Automovil("Ford", "FRG", 456, "Sedán")
    val vehiculo2 = Motocicleta("Mustan", "TRH", 769, 34)

    println(vehiculo1.mostrarInformacion())
    println("Autonomía del automóvil: ${vehiculo1.calcularAutonomia()} km\n")

    println(vehiculo2.mostrarInformacion())
    println("Autonomía de la motocicleta: ${vehiculo2.calcularAutonomia()} km")
}