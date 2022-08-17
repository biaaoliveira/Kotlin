//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)*/

fun main(){

    var idade = 0;
    var idosos = 0;
    var jovens = 0;

    while(idade < 99) {
        println("Digite idades de pessoas")
        var idade = readln().toInt()
    }
    if(idade<=21){
        jovens += 1;

    }else if(idade>=50){
        idosos += 1;
    }
    println("Pessoas com idade menor ou igual a 21: $jovens")
    println("Pessoas com idade maior ou igual a 50: $idosos")
}
