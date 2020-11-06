fun main(args: Array<String>) {
    //Exemplos de tipos primitivos
    val exInt = 55
    val exLong = 40L
    val exFloat = 34.43F
    val exDouble = 45.78
    val exHexadecimal = 0x0F
    val exBinary = 0b010101

    print("\nInteiro: ${exInt}")
    print("\nLong: ${exLong}")
    print("\nFloat: ${exFloat}")
    print("\nDouble: ${exDouble}")
    print("\nHexadecimal: ${exHexadecimal}")
    print("\nBinario ${exBinary}")

    //Exemplo de Conversao
    val numeroInteiro = 987
    val numeroConvertidoParaLong = numeroInteiro.toLong()
    val numeroConvertidoParaString = numeroInteiro.toString()

    //podemos fazer com o valor direto
    val intValue = "101".toInt()

    //Podemos verificar o tipo, mas é redundante pq vc ja inferiou que o tipo é Long na conversao
    if (numeroConvertidoParaLong is Long) {
        println("\nÉ long")
    }

    //Bolean é similar as outras linguagens, só colocar verdadeiro ou falso
    val extBooleanTrue = true
    println("\nA extBooleanTrue é ${extBooleanTrue}")

    val extBooleanFalse = false
    println("\nA extBooleanFalse é ${extBooleanFalse}")

    //Strings podem ser criadas com aspas duplas ou aspas triplas.
    // Além disso, os caracteres de escape podem ser usados com aspas duplas.

    val exString = "In hac habitasse platea dictumst."
    val exStringComScape = "${exString}\n"

    println("\nÉ exString ${exStringComScape}")

    val multipleStringLines = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
        Vestibulum mauris nulla, tempor eget eros quis, 
        convallis eleifend neque. Quisque nunc lectus, 
        faucibus vitae tempor ut, rutrum dignissim libero.
        """

    println("\nCom multiline: ${multipleStringLines}")

    //Tipos de interpolacao sem aspas
    val numeroDaConta = 200
    val mensagem = "Numero da Conta: $numeroDaConta"
    println("\nMessagem: ${mensagem}")

    //Outra coisa legal que você pode fazer é executar alguma lógica dentro das chaves, ao criar uma String literal.
    val age = 40
    val outraMensagem = "Parabens: ${if (age > 60) "Voce pode estacionar nas melhores vagas" else "Voce nao pode usar vaga de idoso"}"
    println("\nMessagem: ${outraMensagem}")
}