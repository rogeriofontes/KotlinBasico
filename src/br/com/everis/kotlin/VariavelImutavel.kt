package br.com.everis.kotlin

fun main(args: Array<String>) {
    val nome = "Rogerio"
    var sobrenome:String = "Fontes"

    //nome = "Rogério" //error: val cannot be reassigned
    var nomeCompleto = nome + " " + sobrenome

    print(nomeCompleto)
}