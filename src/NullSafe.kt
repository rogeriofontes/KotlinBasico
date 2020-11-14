fun main(args: Array<String>) {

    var str: String? = null //-> temos que forca o nulo
    str?.length //=> verifica se a String é nula -> sempre vai retornar um nulo (null) nao uma Exception

    var str1: String? = null
    str1?.length

    var str2: String? = null
//    str2!!.length

    val nome1:String? = null
    nome1.let {
        println("nome is $nome1")
    }

    val nome:String? = null
    nome?.let {
        println("nome is $nome")
    }

    lateinit var nome2: Any
      //  println(nome2)
        // lateinit property name has not been initialized

    var nome3: Any
    //    nome3 = "Joao"
      //  println(nome3)
        // name
}