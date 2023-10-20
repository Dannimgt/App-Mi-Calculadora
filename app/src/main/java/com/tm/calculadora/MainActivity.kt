package com.tm.calculadora

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.tm.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
            var resultado= binding.etNumberOne.text.toString().toInt()+binding.etNumberTwo.text.toString().toInt()
            binding.tvResult.text=resultado.toString()
        }

        binding.btnMultiplica.setOnClickListener {
            var multiplicación=binding.etNumberOne.text.toString().toInt()*binding.etNumberTwo.text.toString().toInt()
            binding.tvResult.text=multiplicación.toString()

        binding.btnResta.setOnClickListener {
            var restar=binding.etNumberOne.text.toString().toInt()-binding.etNumberTwo.text.toString().toInt()
            binding.tvResult.text=restar.toString()
        }

        }
    }

    override fun onCreateView(
        parent: View?,
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {

        return super.onCreateView(parent, name, context, attrs)
    }

}