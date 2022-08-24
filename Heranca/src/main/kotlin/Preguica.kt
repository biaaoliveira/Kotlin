    class Preguica(
            especie: String, nomeCientifico: String, idade: Int,
            habitat: String,  sexo: String,
            val nome: String
        ) : Animal(especie, nomeCientifico, idade, habitat, sexo){

            override fun correr() {
                println("Dúvido")
            }

            override fun dormir() {
                println("Dorme muito")
            }
            override fun cacar() {
                println("Não, come folhinha")
            }

            override fun comer() {
                println("Come beeeeeeem devagar")
            }

        override fun subirArvores() {
            println("Vive em arvores")
        }

            override fun emitirSom() {
                println("Áoáo")
            }

        }

