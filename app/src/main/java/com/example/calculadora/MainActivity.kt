package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSomar.setOnClickListener {
            val vlr1 = binding.edtValor1.text.toString().toDouble()
            val vlr2 = binding.edtValor2.text.toString().toDouble()
            val resultado = vlr1 + vlr2

            binding.txtResultado.text = resultado.toString()

        }

        binding.btnsub.setOnClickListener {
            val vlr1 = binding.edtValor1.text.toString().toDouble()
            val vlr2 = binding.edtValor2.text.toString().toDouble()
            val resultado = vlr1 - vlr2

            binding.txtResultado.text = resultado.toString()

        }

        binding.btnMulti.setOnClickListener {
            val vlr1 = binding.edtValor1.text.toString().toDouble()
            val vlr2 = binding.edtValor2.text.toString().toDouble()
            val resultado = vlr1 * vlr2

            binding.txtResultado.text = resultado.toString()

        }

        binding.btnDiv.setOnClickListener {
            val vlr1 = binding.edtValor1.text.toString().toDouble()
            val vlr2 = binding.edtValor2.text.toString().toDouble()
            val resultado = vlr1 / vlr2

            binding.txtResultado.text = resultado.toString()

        }

    }

}