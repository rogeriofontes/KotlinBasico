fun main() {

    //Arrays sempre tem tamanhos fixos

    //Em Kotlin, há duas maneiras principais para criar uma matriz: usando a função auxiliar arrayOf() ou o construtor Array()

    val arrayComNumeros = arrayOf(4, 5, 7, 3)
    print("\n Array com números: " + arrayComNumeros.size)
    print("\n Array com números position: " + arrayComNumeros[1])

    val arrayComVariosTipos = arrayOf(4, 5, 7, 3, "MG", false)
    print("\n Array com números: " + arrayComVariosTipos.size)

    val arrayNumeros = intArrayOf(1,2,3)
    println("\n" + arrayComNumeros[2])

    for (numero in arrayComNumeros)
        println("Nomeros " + numero)

    //Com index:
    for ((index, numero) in arrayNumeros.withIndex()) {
        println("idx:$index numero: " + numero)
    }

    //val arrayComVariosTiposDefinidosCast = arrayOf<Int>(4, 5, 7, 3, "Chike", false) // com tipos nao compila
    //Kotlin: Type mismatch: inferred type is String but Int was expected

    //val arrayComVariosTiposDefinidos = intArrayOf(4, 5, 7, 3, "Chike", false)  // com tipos nao compila
    //Kotlin: Type mismatch: inferred type is String but Int was expected

    //Construtor Array()
    val arrayComConstructor = Array(5, { i -> i * 2 })
    print("\narray com contrutor: " + arrayComConstructor.size);

    //Soma de Arrays
    var estadosSudeste = arrayOf("MG, SP, RJ")

    var estadosSul = arrayOf("SC, RS")

    var estadosSudesteSul = estadosSul + estadosSudeste

    for (estado in estadosSudesteSul)
        println("Estado ${estado}")

    //String array de caracteres
    val joao = "Joao da Silva Xavier"
    var totalLetras = joao.length
    println("\n Total de Letras: $totalLetras")
    println("Letra:" + joao[8])
}