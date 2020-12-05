package br.com.everis.kotlin

fun main() {
    println("Olã")

    class Funcionario {
        var nome = "Rogerio Fontes"
        var matricula = 12345
        var tecnologia = "Java"
    }

    val contaRogerio = Funcionario()
    println("Nome ${contaRogerio.nome}, Matricula: ${contaRogerio.matricula}, Tecnolia: ${contaRogerio.tecnologia}")
}
//Mesmo podendo usar dentro de funcoes uma classe ela nao estara visivel para outros lugares da App