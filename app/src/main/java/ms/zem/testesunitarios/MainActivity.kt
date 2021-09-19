package ms.zem.testesunitarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatEditText
import ms.zem.testesunitarios.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var useCase: UseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupUseCase()
        setListners()
    }

    private fun setupUseCase() {
        useCase = DI.injectUseCaseImplement()
    }

    private fun setListners() {
        binding.btnSomar.setOnClickListener {
            somar()
        }
        binding.btnSubtrair.setOnClickListener {
            subtrair()
        }
        binding.btnMultiplicar.setOnClickListener {
            multiplicar()
        }
        binding.btnDividir.setOnClickListener {
            dividir()
        }
    }

    private fun somar() {
        binding.tvResposta.text = useCase.somar(
            binding.edtPrimeiroValor.toDouble(),
            binding.edtSegundoValor.toDouble()
        ).toString()
    }

    private fun subtrair() {
        binding.tvResposta.text = useCase.subtrair(
            binding.edtPrimeiroValor.toDouble(),
            binding.edtSegundoValor.toDouble()
        ).toString()
    }

    private fun multiplicar() {
        binding.tvResposta.text = useCase.multiplicar(
            binding.edtPrimeiroValor.toDouble(),
            binding.edtSegundoValor.toDouble()
        ).toString()
    }

    private fun dividir() {
        binding.tvResposta.text = useCase.dividir(
            binding.edtPrimeiroValor.toDouble(),
            binding.edtSegundoValor.toDouble()
        ).toString()
    }
}


/**
 *
 */

fun AppCompatEditText.toDouble(): Double {
    var valor = this.text.toString()
    if ( valor.isBlank() ) {
        valor = "123.00"
        this.setText(valor)
    }
    return try {
        val res = valor.toDoubleOrNull()
        res?.let { res } ?: 123.0
    } catch (ex: Exception) {
        return 123.0
    }
}

