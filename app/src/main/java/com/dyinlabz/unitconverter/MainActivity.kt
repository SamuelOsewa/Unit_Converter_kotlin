package com.dyinlabz.unitconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dyinlabz.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConvert.setOnClickListener {
            convertUnit()
        }
    }

    fun convertUnit(){
        val getValue = binding.etValue.text.toString()
        val value = getValue.toDouble()

        val unit = binding.rgUnits.checkedRadioButtonId

        val convertedValue = when(unit){
            R.id.feet_to_metres -> value / 3.281
            else -> value * 3.281
        }

        binding.tvResult?.text = convertedValue.toString()

    }
    

}