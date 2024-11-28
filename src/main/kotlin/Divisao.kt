package org.example

fun main() {
    print("Digite um número:") // instrução
    val num: Int = readLine()?.toIntOrNull() ?: 0 // le o input com a função readline

    print("Digitr o valor do divisor:") // instrução
    val divisor: Int = readLine()?.toIntOrNull() ?: 1 // le o input com a função readline

    if (num != 0){ // se o numero inserido for diferente de 0 entra nessa condição
        val resultado: Int = divisor / num // executa o calculo
        println("O resultado da divisão é: ${resultado}")
    } else { //se o número inserido for 0 informa que não é possível realizar o calculo
        println("Não é possível dividir um número por zero.")
    }
}