    abstract class Animal (
        val especie: String,
        val nomeCientifico: String,
        val idade: Int,
        val habitat:String,
        val sexo: String
        ){

        abstract fun correr()

        abstract fun dormir()

        abstract fun cacar()

        abstract fun comer()

        abstract fun subirArvores()

        abstract fun emitirSom()

    }

