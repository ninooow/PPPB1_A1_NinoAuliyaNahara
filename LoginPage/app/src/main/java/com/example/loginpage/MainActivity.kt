package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            button.setOnClickListener{
                Toast.makeText(this@MainActivity,"Success",Toast.LENGTH_SHORT).show()
            }
            register.setOnClickListener{
                Toast.makeText(this@MainActivity,"Success",Toast.LENGTH_SHORT).show()
            }
        }
    }
}