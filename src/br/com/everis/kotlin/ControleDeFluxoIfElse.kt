package br.com.everis.kotlin

fun main(args: Array<String>) {
    var idade: Int = 15

    if (idade > 60) {
        println("Voce pode pegar boas vagas..kkk")
    } else if (idade < 80){
        print("Voce tem acesso ao motorista")
    } else {
        print("Voce tem que estacionar longe..kkk")
    }


    var qualIdade: String =  if (idade < 18) "Menor de Idade" else "Maior de idade" // Nesse caso sempre precisa do else
    println("\n" + qualIdade)

    var qualIdade1: String =  if (idade < 18) {
        println("Maior de idade")
        "Menor de Idade" //retorno sempre é da ultima aula
    } else {
        "Maior de idade"
    } // Nesse caso sempre precisa do else
    println("\n" + qualIdade1)
}