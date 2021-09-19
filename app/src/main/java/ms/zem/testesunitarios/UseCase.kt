package ms.zem.testesunitarios

interface UseCase {
    fun somar(valorUm: Double, valorDois: Double): Double
    fun subtrair(valorUm: Double, valorDois: Double): Double
    fun multiplicar(valorUm: Double, valorDois: Double): Double
    fun dividir(valorUm: Double, valorDois: Double): Double
}