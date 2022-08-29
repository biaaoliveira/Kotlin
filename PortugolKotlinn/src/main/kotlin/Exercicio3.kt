fun main()
{

    println("Digite um valor para o primeiro número: ")
    var n1 = readln().toInt()

    println("Digite um valor para o segundo número: ")
    var n2 = readln().toInt()

    println("Digite um valor para o terceiro número: ")
    var n3 = readln().toInt()

    println("Digite um valor para o quarto número: ")
    var n4 = readln().toInt()

    n1 = (n1 * n1)
    n2 = (n2 * n2)
    n3 = (n3 * n3)
    n4 = (n4 * n4)

    if(n3 >= 1000){

        println("O quadrado do terceiro número digitado é: " + n3)

    }else{

        println("O resultado é:")
        println("\n $n1")
        println("\n $n2")
        println("\n $n3")
        println("\n $n4")

    }
}
