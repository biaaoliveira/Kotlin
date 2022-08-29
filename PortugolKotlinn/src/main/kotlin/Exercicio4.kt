fun main()
{
    println("Insira o valor desejado: ")
    var num1 = readln().toInt()

    while(num1 <=100){
        num1 = num1 * 3

        println("\nSequência: $num1")
    }

}