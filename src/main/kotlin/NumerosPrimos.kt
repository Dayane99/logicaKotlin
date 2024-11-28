package org.example
import java.util.Scanner

//Desenvolver um sistema de números primos:
//Solicitar o intervalo de números (ou aceitar um único número como entrada);
//Iterar sobre cada número no intervalo;
//Descartar números menores ou iguais a 1;
//Testar divisibilidade pelo méto do escolhido;
//Armazenar e exibir os números identificados como primos.


fun main() {
    val scannerInput = Scanner(System.`in`) // inicializa o scanner
    var numeros : MutableList<Int> = mutableListOf()
    var primosList : MutableList<Int> = mutableListOf()

    println("Digite os numeros que deseja testar, ao final digite 'sair' para sair.") //primeira instrução do menu

do {
    print("Digite um número:")
    val entrada = scannerInput.nextLine() // pega o que foi inserido por meio do scanner

    if (entrada == "sair") break // se o usuário tiver digitado o comando para sair irá sair do looping

    val verificaInt : Int? = entrada.toIntOrNull() // verifica se a entrada é um número ou não

    if(verificaInt == null) { // se o usuário não tiver digitado um número, irá printar a mensagem abaixo
        println("Digite um valor valido")
        continue // roda o looping novamente
    } else { // se for um número ele incrementa ao final da lista de numeros
        numeros.add(verificaInt)
    }
} while (true) // torna o looping verdadeiro


    for (numero in numeros){ // itera sobre todos os itens lista de números add pelo úsuário
        var verifica = true // todos os números são considerados verdadeiros(primo), até que se prove o contrario

        if (numero <= 1) // se o número for igual ou menor que 1 ele não é primo
            verifica = false

        for (contador in 2 until numero) { // irá iterar sobre cada um dos números iniciando o contador no 2 até o número que está sendo verificado
            if (numero % contador == 0){ // se o resto da verificação for 0 quer fizer que ele não é primo
                verifica = false
                break
            }
        }
            if (verifica){ // se ele continuar verdadeiro add ao final da lista de números primos
                primosList.add(numero)
            }
    }

    println("Está é a lista de números adicionados: $numeros,\ne estes são os números primos: ${primosList}.")

}