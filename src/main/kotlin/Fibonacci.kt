package org.example

fun main() {
    var numAtual: Int = 0
    var numSucessor: Int = 1
    var resultado: Int = 0
    var contador: Int = 0

    while (contador <= 8){ // contador irá realizar o looping até 8
        println("${resultado}") //printa o resultado
        numAtual = numSucessor // atribui o número sucessor ao atual
        numSucessor = resultado // atribui o resultado ao numero sucessor
        resultado = numAtual + numSucessor // realiza a soma do número atual com o número sucessor
        contador += 1 // incrementa o contador
    }
}