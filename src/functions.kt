fun main(args: Array<String>) {
    ola()
    println(olax())
    println(concatena("Rogerio", "Fontes"))
}

fun ola() {
    println("E ai mano")
}

fun olax(): String {
    return "E ai man x"
}

fun concatena(nome: String, sobrenome: String): String {
    val saudacao = olax()
    return saudacao + "\t" + (nome + "\t" + sobrenome)
}