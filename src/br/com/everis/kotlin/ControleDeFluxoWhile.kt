package br.com.everis.kotlin

fun main(args: Array<String>) {

    //while simples
    var i = 1

    while (i <= 5) {
        println("incremento $i")
        ++i
    }

    var sum = 0
    var j = 100

    while (j != 0 && i < 1000) {
        sum += j     // sum = sum + i;
        --j
    }
    println("\nSomatoria: = $sum")
}