fun main ()
{
    println("Digite o peso dos tomates: ")
    val peso = readln().toInt()

    if(peso > 50){

        val exc = peso - 50;

        val multa = exc * 4.0


        println("O peso dos tomates foi: , $peso, kg")
        println("O número de tomates excedentes foi:, $exc")
        println("O valor da multa ficou em torno de R$," + multa)

    }
}
