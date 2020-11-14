fun main() {
    println("Olã")

    val funcionarioRogerio = Funcionario2("Rogerio Fontes", 12345, "Java", 1000.00)
    val calculaBonus2 = funcionarioRogerio.calculaBonus(101.99)
    println("Bonus Seu bonus é ${calculaBonus2}")

    println("Nome ${funcionarioRogerio.nome}, Matricula: ${funcionarioRogerio.matricula}, Tecnolia: ${funcionarioRogerio.tecnologia}")

    val funcionarioJoao = Funcionario2(nome = "Rogerio Fontes", matricula = 12345, tecnologia = "Java", salario = 1000.00)
    val calculaBonus1 = funcionarioJoao.calculaBonus(101.99)
    println("Bonus Seu bonus é ${calculaBonus1}")

    println("Nome ${funcionarioJoao.nome}, Matricula: ${funcionarioJoao.matricula}, Tecnolia: ${funcionarioJoao.tecnologia}")

    val funcionarioJoaoMaria = Funcionario2(salario = 1000.00, nome = "Rogerio Fontes",  tecnologia = "Java", matricula = 12345)

    val calculaBonus = funcionarioJoaoMaria.calculaBonus(101.99)
    println("Nome ${funcionarioJoaoMaria.nome}, Matricula: ${funcionarioJoaoMaria.matricula}, Tecnolia: ${funcionarioJoaoMaria.tecnologia}")
    println("Bonus Seu bonus é ${calculaBonus}")
}

class Funcionario2(var nome: String, var matricula: Int, var tecnologia: String, var salario: Double){

    val firstProperty = "First property: $nome".also(::println)

    init {
        println("First ${firstProperty} initializer block that prints ${nome}")
    }

    val secondProperty = "Second property: ${nome.length}".also(::println)

    init {
        println("Second ${secondProperty} initializer block that prints ${nome.length}")
    }

    fun calculaBonus(bonus: Double): Double {
        return this.salario + bonus;
    }
}