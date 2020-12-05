package br.com.everis.kotlin

fun main(args: Array<String>) {


    val bolos = listOf("carrot", "cheese", "chocolate")

    for (bolo in bolos)
        println("Bolo tipo: $bolo")

    val planetas = listOf("terra", "marte", "plutao")

    for (planeta in planetas) {
        println("Planeta do sistem solar: $planeta")

    }
}