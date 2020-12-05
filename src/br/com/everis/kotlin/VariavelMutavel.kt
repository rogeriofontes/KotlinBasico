package br.com.everis.kotlin

fun main(args: Array<String>) {//> Kotlin 1.3
    var nome = "Rogerio"
    var sobrenome:String = "Fontes"

    nome = "Rogério"
    var nomeCompleto = nome + " " + sobrenome

    print(nomeCompleto)
}