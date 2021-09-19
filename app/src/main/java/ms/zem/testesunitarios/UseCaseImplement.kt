package ms.zem.testesunitarios

class UseCaseImplement : UseCase {
    override fun somar(valorUm: Double, valorDois: Double): Double {
        return valorUm + valorDois
    }
    override fun subtrair(valorUm: Double, valorDois: Double): Double {
        return valorUm - valorDois
    }
    override fun multiplicar(valorUm: Double, valorDois: Double): Double {
        return valorUm * valorDois
    }
    override fun dividir(valorUm: Double, valorDois: Double): Double {
        return if (valorDois == 0.0) {
            0.0
        } else {
            valorUm / valorDois
        }
    }
}