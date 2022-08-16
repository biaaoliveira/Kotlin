//Faça um programa que receba três inteiros e diga qual deles é o maior.

fun main() {
    println("Digite um valor para n1: ")
    var n1 = readln().toInt()

    println("Digite um valor para n2: ")
    var n2 = readln().toInt()

    println("Digite um valor para n3: ")
    var n3 = readln().toInt()

    if (n1 > n2 && n1 > n3) {
        println("O maior número é: $n1")
    } else if (n2 > n1 && n2 > n3) {
        println("O maior número é: $n2")
    } else if (n3 > n1 && n3 > n2) {
        println("O maior número é: $n3")
    }
}