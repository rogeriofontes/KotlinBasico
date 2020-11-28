fun main() {
    //TipoCartoes.BLACK
    //var name = TipoCartoes.PLATINUM.name
  // println(name)

    //var color = TipoCartoes.PLATINUM.color
   // println(color)

    //for (tipoCartao in TipoCartoes.values()) {
      //  println("O cartao ${tipoCartao.name} e da cor ${tipoCartao.color}")
    //}

    //var cartaoPorCor = TipoCartoes.getCartaoPorCor("BLACK")
    //println(cartaoPorCor)

    //var a = TipoCartoes.a
   // print("Variavel: " + a)

    val calculaCashBack = TipoCartaoCashBack.PLATINUM.calculaCashBack(5000f)
    val limitCartao = TipoCartaoCashBack.PLATINUM.getLimit()
    print("O cashback do cartao BLack e $calculaCashBack e o limit ~e de $limitCartao")
}

/*enum class TipoCartoes {
    NORMAL, GOLD, PLATINUM, BLACK
}*/

enum class TipoCartoes(val color: String) {
    NORMAL("cinza"), GOLD("dourado"), PLATINUM("marrom"), BLACK("preto");

    companion object {
        /*fun getCartaoPorCor(name: String): TipoCartoes {
            return valueOf(name.toUpperCase())
        } */

        val a: String = "teste"
        fun getCartaoPorCor(name: String) = valueOf(name.toString())
    }
}

enum class TipoCartaoCashBack: LimitCartao, CalculaCashBack {
    NORMAL {
        override fun calculaCashBack(value: Float): Float {
            return value + 0.10f
        }

        override fun getLimit(): Int {
           return 500;
        }
    }, GOLD {
        override fun calculaCashBack(value: Float): Float {
            return value + 0.25f
        }

        override fun getLimit(): Int {
            return 1000;
        }
    }, PLATINUM {
        override fun calculaCashBack(value: Float): Float {
            return value + 0.50f
        }

        override fun getLimit(): Int {
            return 1500;
        }
    }, BLACK {
        override fun calculaCashBack(value: Float): Float {
            return value + 0.75f
        }

        override fun getLimit(): Int {
            return 10000;
        }
    };

    //abstract fun calculaCashBack(value: Float): Float
    //abstract fun getLimit(): Int
}

interface LimitCartao {
   fun getLimit(): Int
}

interface CalculaCashBack {
    fun calculaCashBack(value: Float): Float
}

//https://www.alura.com.br/artigos/reduzindo-de-n-ifs-para-nenhum-com-strategy-em-java