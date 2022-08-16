package com.example.ftoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ftoc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 2 Click . Registrar el click

        binding.btnConvertir.setOnClickListener{
            // 3 Recuperar el input

         val fahrenheit = binding.editTextF.text.toString().toDouble()
            val celsius = (fahrenheit-32) * (5.0/9.0)
            binding.editTextC.setText(String.format("%.1f",celsius))

           val selected =  binding.radioGroupTemp.checkedRadioButtonId

            val valor = when (selected) {
                R.id.radioButton_C  -> "Celsius 2.0"
                else -> "Fahrenheit"

            }

            val switchVal = binding.switch1.isChecked

            Toast.makeText(this,valor,Toast.LENGTH_SHORT).show()

            Toast.makeText(this,switchVal.toString(),Toast.LENGTH_SHORT).show()





        }
    }
}