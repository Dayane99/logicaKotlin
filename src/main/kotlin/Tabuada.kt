package org.example
import java.util.*

//Desenvolver um sistema que gere a tabuada de um número
//Verificar se a entrada é numérica. Se o valor inserido não for um número, retornar um erro ou solicitar nova entrada;
//Garantir que o valor inserido não seja nulo ou vazio;
//permitir somente números positivos

fun main(){
    val scanner = Scanner(System.`in`); // instânciando a variavel para utilizar o scanner
    val regex = Regex("^\\d+$"); // instânciando a variavel para utilizar o regex, excluindo tudo que não seja número
    var result: Int;
    var contador: Int = 1;

    do { // menu
        print("Digite um número, ou digite 'sair' para sair: ") // primeira instrução
        val numero: String = scanner.nextLine().trim() // variavel número recebe input pelo scanner e pega somente o numero com a função trim

        if (numero == "sair") break // Sai do loop se o usuário digitar 'sair'

        if (regex.matches(numero)) { // Verifica se é um número válido
            val numeroInt = numero.toInt() // Converte para Int

            while (contador <= 10) {
                result = numeroInt * contador // Faz a multiplicação
                println("$numeroInt x $contador = $result")
                contador += 1 // Incrementa o contador
            }

            contador = 1 // Reinicia o contador para a próxima tabuada

        } else {
            println("Por favor, digite um número válido \n") // condição caso o que foi recebido não seja um número
        }
    } while (true) // torna a condição do do while verdadeira enquanto forem digitados números
}