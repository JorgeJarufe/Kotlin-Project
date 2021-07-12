package one.digitalinnovation.digionebank

class Pessoa (
    var nome: String = "Jorge",
    var cpf: String = "146.597.548.98"
)
fun main(args: Array<String>){
    val Jorge = Pessoa()

    println(Jorge.nome)
    println(Jorge.cpf)
}