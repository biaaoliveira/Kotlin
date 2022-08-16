//Faça um programa que entre com três números e coloque em ordem crescente.

fun main (){
    println("Digite um número:")
    var n1 = readln().toInt()

    println("Digite um número: ")
    var n2 = readln().toInt()

    println("Digite um número: ")
    var n3 = readln().toInt()

    if(n1>n2 && n1>n3 && n2>n3) {
        println("Em ordem crescente: $n1, $n2 e $n3")
    }
    else if(n1>n2 && n1>n3 && n3>n2) {
        println("Em ordem crescente: $n1, $n3 e $n2")
    }
    else if(n2>n1 && n2>n3 && n1>n3){
        println("Em ordem crescente: $n2, $n1 e $n3")
    }
    else if(n2>n1 && n2>n3 && n3>n1) {
        println("Em ordem crescente: $n2, $n3 e $n1")
    }
    else if(n3>n2 && n3>n1 && n1>n3) {
        println("Em ordem crescente: $n3, $n2 e $n1")
    }
    else if(n3>n2 && n3>n1 && n1>n2) {
        println("Em ordem crescente: $n3, $n1 e $n2")
    }
}