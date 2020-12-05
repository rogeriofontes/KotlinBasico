package br.com.everis.kotlin.oo

abstract class Funcionario(name: String) { //Todas as classe no kotlin sao final
        init {
            println("roda antes de todo mundo")
        }

        init {
            println("roda antes de todo mundo2")
        }

        fun test()  = "Fui chamado"

        init {
            println("roda antes de todo mundo3")
        }
}

class Gerente(name: String) : Funcionario(name), Bonificacao {
    var salario: Double = 0.0
    get() {
        return field
    }
    set(value) {
        field = value + 10
    }

    var email: String = "root@localhost"
    private set

    override fun bonificacao() {
        TODO("Not yet implemented")
    }
}

interface Bonificacao {
    fun bonificacao()
    fun limit(): Int {
        return 100
    }
    fun limitMax() = 1000
}

fun main() {
    val funcionario = Gerente("Daniel")
    println(funcionario.test())
}