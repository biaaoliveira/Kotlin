    class Cavalo(
            especie: String, nomeCientifico: String, idade: Int,
            habitat: String,  sexo: String,
            val nome: String
        ) : Animal(especie, nomeCientifico, idade, habitat, sexo){

            override fun correr() {
                println("Trotando")
            }

            override fun dormir() {
                println("Dorme de pé")
            }
            override fun cacar() {
                println("Não")
            }

            override fun comer() {
                println("Comendo como um cavalinho")
            }

        override fun subirArvores() {
            print("Nunca vi! k")
        }

            override fun emitirSom() {
                println("Iiiihhhhh")
            }

        }
