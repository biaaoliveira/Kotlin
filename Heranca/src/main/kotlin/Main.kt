    fun main (){

        val cavalo1 = Cavalo(
            "Cavalinho", "Eduus ", 10 , "Fazenda", "Macho", "Pocoto"
        )

        val preguica1 = Preguica(
            "Preguicinha", "Folivora", 3 , "Floresta", "Macho", "Flash"

        )

        val cachorro1 = Cachorro(
            "Cachorrinho", "Golden ", 6 , "Casa", "Macho", "Dogzinho"
        )

        cavalo1.emitirSom()
        preguica1.emitirSom()
        cachorro1.emitirSom()
    }