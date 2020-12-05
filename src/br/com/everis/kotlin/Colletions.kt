package br.com.everis.kotlin

fun main() {
    //Imutavel
    val listOf = listOf("SP", "RJ", 1)

    for ((index, list) in listOf.withIndex()) {
        println("row : $index - $list")
    }

    //======

    var mutableListOf = mutableListOf<String>("SP", "RJ")
    mutableListOf.add("SM")
  //  mutableListOf.add(3, "33" as Nothing)

    for ((index, list) in mutableListOf.withIndex()) {
        println("row : $index - $list")
    }

    //====================
    //Array List
    var estados = arrayListOf<String>("RJ", "MG", "RS")

    estados.add("DF")
    estados.add("BA")

    estados.remove("DF")
    estados.size

    var contains = estados.contains("MG")
    print("Contais $contains")

    estados.forEach {
        estado -> print("Estado: $estado")
    }

   /* if(estados.isNotEmpty()) {
        for (estado in estados) {
            print("Estado: $estado")
        }
    }*/

    //===
    var hashSetOf = hashSetOf<String>("RJ", "MG", "RS")
    hashSetOf.add("DF")
    //hashSetOf.add("MG")

    hashSetOf.forEach() {
        estado -> print("Estado: $estado")
    }

    var hashMapOf = hashMapOf("nome" to "Rogerio", "email" to "root@localhost")
    hashMapOf.put("squad", "garantias")

    for (dados in hashMapOf) {
        println("${dados.key}:${dados.value}")
    }
    //map => chave e valor

}