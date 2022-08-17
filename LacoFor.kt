//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

fun main() {
    for(num in 1 .. 10) {
        println("Digite 10 números")
        var num = readln().toInt()

        if (num % 2 == 0) {
            num += 1;
            ("O número de pares são: $num")
        } else if (num % 2 != 0) {
            num += 1;
            ("O número de impares são: $num")
        }
    }
}
