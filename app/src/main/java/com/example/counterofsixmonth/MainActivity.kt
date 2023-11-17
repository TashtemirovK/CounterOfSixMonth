package com.example.counterofsixmonth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counterofsixmonth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnInc.setOnClickListener {
            viewModel.counterLV.value?.minus(1)
            viewModel.inc()
        }

        binding.btnInc.setOnClickListener {
            viewModel.dec()
        }

        viewModel.counterLV.observe(this) { result ->
            binding.tvResult.text = result.toString()
        }
    }
}