fun main() {


    println("***Digite dois valores para fazermos a conta***\n")
    print("Valor 1: ")
    val num1 = readLine()!!.toDouble()
    print("Valor 2: ")
    val num2 = readLine()!!.toDouble()

    var operacao = ""

    do{

        println("\nDigite a operação matemática, entre soma (+), " +
                "subtração (-), divisão(/) e multiplicação(*)")
        operacao = readLine()!!

        if(!(operacao == "+" || operacao == "-" || operacao == "/" || operacao == "*")){
            println("Operação inválida")
        }

    }while (!(operacao == "+" || operacao == "-" || operacao == "/" || operacao == "*"))

    when(operacao){

        //Funções sem retorno
        /*
        "+" -> somaSem(num1, num2)
        "-" -> subtracaoSem(num1, num2)
        "/" -> divSem(num1, num2)
        "*" -> multSem(num1, num2)
         */

        //Funções com retorno
        "+" -> println("A soma dos números é ${somaCom(num1, num2)}")
        "-" -> println("A subtração dos números é ${subtracaoCom(num1, num2)}")
        "/" -> println("A divisão dos números é ${divCom(num1, num2)}")
        "*" -> println("A multiplicação dos números é ${multCom(num1, num2)}")


    }
}

//Funções sem retorno

fun somaSem (n1: Double, n2: Double){
    println("A soma entre os números é: ${n1 + n2}")
}

fun subtracaoSem (n1: Double, n2: Double){
    println("A subtração entre os números é: ${n1 - n2}")
}

fun multSem (n1: Double, n2: Double){
    println("A multiplicação entre os números é: ${n1 * n2}")
}

fun divSem (n1: Double, n2: Double){
    println("A divisao entre os números é: ${n1 / n2}")
}

//Funções com retorno

fun somaCom (n1: Double, n2: Double): Double{
    return n1 + n2
}

fun subtracaoCom (n1: Double, n2: Double): Double{
    return n1 - n2
}

fun multCom (n1: Double, n2: Double): Double{
    return n1 * n2
}

fun divCom (n1: Double, n2: Double): Double{
    return n1 / n2

}