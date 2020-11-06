fun main(args: Array<String>) {
    var tipoPessao: Int = 2

    val result = when(tipoPessao) {
        1 -> "Nome: Joao - Cpf: 2333"
        2 -> "Razão social: Bela torm - Cnpj: 43443"
        else -> {
            "Desconhecido"
        }
    }

    println(result)


}
