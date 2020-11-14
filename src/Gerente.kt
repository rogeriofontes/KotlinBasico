import java.lang.Exception

/*class Gerente(override val nome: String,
              override val matricula: Int = 0,
              override val tecnologia: String,
              override val salario: Double) : Funcionario(nome, matricula, tecnologia, salario), Palestrante, Mecanico {

    override fun calculaBonus(bonus: Double): Double  {
        return this.salario + bonus + 10;
    }

    override fun oratoria(): String {
        return "O $nome e bom de oratoria"
    }

    override fun arrumaMotor(): String {
        return "O $nome e bom de tmb de mecanica"
    }
}

interface Palestrante {
    fun oratoria(): String
    fun skillOratorio(): String {
        return "Boa comunicacao"
    }
}

interface Mecanico {
    fun arrumaMotor(): String
}

fun main() {
    val daniel = Gerente(matricula = 123456, salario = 10000.00, tecnologia = "gestao", nome = "Daniel")
    val refinaldo = Gerente(matricula = 123456, salario = 10000.00, tecnologia = "gestao", nome = "Daniel")
   // println("O gerente: ${daniel.nome}, tem matricula ${daniel.matricula}" +
  //          "tem salario de ${daniel.salario} e trabalha com ${daniel.tecnologia}")

    //println("e para apresentacao ele tem: ${daniel.oratoria()}")
   // println("e para apresentacao ele tem: ${daniel.skillOratorio()}")
   // println("e para apresentacao ele tem: ${daniel.arrumaMotor()}")

    var funcionarioTO = FuncionarioTO("Daniel", 1020, "gestao", 10000.00, "10 anos")
    println("TO: Nome ${funcionarioTO.nome}, Matricula: ${funcionarioTO.matricula}, Tecnolia: ${funcionarioTO.tecnologia}")

    var gerentes = mutableListOf<Gerente>()

    gerentes.add(daniel)
    gerentes.add(refinaldo)

    for (gerente in gerentes) {
        println("O gerente ${gerente.nome}")
    }
}

data class FuncionarioTO(var nome: String, var matricula: Int, var tecnologia: String, var salario: Double, var experiencia: String)
*
 */