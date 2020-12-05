package br.com.everis.kotlin

fun main() {
    val funcionarioRogerio = Funcionario(matricula = 123456, salario = 1000.00, tecnologia = "Kotlin", nome = "Rogerio Fontes")
   // funcionarioRogerio.nome = "Rogerio Fontes"
    //funcionarioRogerio.tecnologia = "Kotlin"
    //funcionarioRogerio.salario = 1000.00
    //funcionarioRogerio.matricula = 123456
    val calculaBonus = funcionarioRogerio.calculaBonus(10.00)
    println("Seu bonus é de: $calculaBonus")

    println("O funcionario: ${funcionarioRogerio.nome}, tem matricula ${funcionarioRogerio.matricula}" +
            "tem salario de ${funcionarioRogerio.salario} e trabalha com ${funcionarioRogerio.tecnologia}")

    val funcionarioMaria = Funcionario("Maria", 123457, "Kotlin", 1100.00)
    funcionarioMaria.skillplus = "Oratoria"
    //funcionarioMaria.nome = "Maria"
    //funcionarioMaria.tecnologia = "Kotlin"
    //funcionarioMaria.salario = 1100.00
    //funcionarioMaria.matricula = 123457

    val calculaBonusMaria = funcionarioMaria.calculaBonus(10.00)
    println("Seu bonus é de: $calculaBonusMaria")

    println("O funcionario: ${funcionarioMaria.nome}, tem matricula ${funcionarioMaria.matricula}" +
            "tem salario de ${funcionarioMaria.salario} e trabalha com ${funcionarioMaria.tecnologia}" +
            "skills complementares ${funcionarioMaria.skillplus}")
    //var x = "Rogerio";
    /*var xx: Unit = when {
        x.length > 0 -> {
            println("zero")
        }
        x.length > 1 && x.length < 10 -> {
            print("primeiros numeros")
        }
        x.length > 10 && x.length < 20 -> {
            print("casas dos vintes")
        }
        else -> {
            print("qualquer numero")
        } */

    //mac: option + return

    //win: alt + enter
   // }
}

open class Funcionario(open val nome: String, open val matricula: Int = 0, open val tecnologia: String, open val salario: Double) {
var skillplus: String = ""
    //var matricula: Int = 0
    //var tecnologia = ""
    //var salario = 0.0

    private var nome1: String
    var yyyyy = "X: $nome".also() { println("nao achou nada") }
    init {
        this.nome1 = nome
        println("Inicializei primeiro ${yyyyy}")
    }

    open fun calculaBonus(bonus: Double): Double  {
        return this.salario + bonus
    }
}