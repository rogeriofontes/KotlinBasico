package br.com.everis.kotlin

fun main() {
    //br.com.everis.kotlin.TipoCartoes.BLACK
    //var name = br.com.everis.kotlin.TipoCartoes.PLATINUM.name
  // println(name)

    //var color = br.com.everis.kotlin.TipoCartoes.PLATINUM.color
   // println(color)

    //for (tipoCartao in br.com.everis.kotlin.TipoCartoes.values()) {
      //  println("O cartao ${tipoCartao.name} e da cor ${tipoCartao.color}")
    //}

    //var cartaoPorCor = br.com.everis.kotlin.TipoCartoes.getCartaoPorCor("BLACK")
    //println(cartaoPorCor)

    //var a = br.com.everis.kotlin.TipoCartoes.a
   // print("Variavel: " + a)

    val calculaCashBack = TipoCartaoCashBack.PLATINUM.calculaCashBack(5000f)
    val limitCartao = TipoCartaoCashBack.PLATINUM.getLimit()
    print("O cashback do cartao BLack e $calculaCashBack e o limit ~e de $limitCartao")

    var cartao = Cartao()
    //cartao.calculaCashBack()
    cartao.getLimitPadrao()
    cartao.getLimitPadrao1()

}

/*enum class br.com.everis.kotlin.TipoCartoes {
    NORMAL, GOLD, PLATINUM, BLACK
}*/

enum class TipoCartoes(val color: String) {
    NORMAL("cinza"), GOLD("dourado"), PLATINUM("marrom"), BLACK("preto");

    companion object {
        /*fun getCartaoPorCor(name: String): br.com.everis.kotlin.TipoCartoes {
            return valueOf(name.toUpperCase())
        } */

        val a: String = "teste"
        fun getCartaoPorCor(name: String) = valueOf(name.toString())
    }
}

enum class TipoCartaoCashBack: LimitCartao, CalculaCashBack {
    NORMAL {
        override fun calculaCashBack(value: Float) = value + 0.10f
        override fun getLimit() = 500
    }, GOLD {
        override fun calculaCashBack(value: Float)= value + 0.25f
        override fun getLimit() = 1000
    }, PLATINUM {
        override fun calculaCashBack(value: Float) = value + 0.50f
        override fun getLimit() = 1500
    }, BLACK {
        override fun calculaCashBack(value: Float) = value + 0.75f
        override fun getLimit() = 10000
    };
}

/*enum class br.com.everis.kotlin.TipoCartaoCashBack: br.com.everis.kotlin.LimitCartao, br.com.everis.kotlin.CalculaCashBack {
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
} */

class Cartao(): CalculaCashBack {
    override fun calculaCashBack(value: Float): Float {
        TODO("Not yet implemented")
    }

    override fun getLimitPadrao(): Float {
        return 10000f
    }
}

interface LimitCartao {
   fun getLimit(): Int
}

interface CalculaCashBack {
    fun calculaCashBack(value: Float): Float
    fun getLimitPadrao(): Float {
        return 300f
    }

    fun getLimitPadrao1(): Float {
        return 300f
    }
    fun getLimitPadrao2(): Float {
        return 300f
    }
    fun getLimitPadrao3(): Float {
        return 300f
    }
    fun getLimitPadrao4(): Float {
        return 300f
    }

}

//https://www.alura.com.br/artigos/reduzindo-de-n-ifs-para-nenhum-com-strategy-em-java