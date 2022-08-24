     class Cachorro(especie: String, nomeCientifico: String, idade: Int,
            habitat: String,  sexo: String,
            val nome: String
            ) : Animal(especie, nomeCientifico, idade, habitat, sexo){

                override fun correr() {
                    println("Corre como um cachorro")
                }

                override fun dormir() {
                    println("Dorme como um cachorro")
                }
                override fun cacar() {
                    println("Não caça")
                }

                override fun comer() {
                    println("Comendo como um cachorrinho")
                }

                override fun subirArvores() {
             println("Não")
         }

                override fun emitirSom() {
                    println("AUaU")
                }
            }

