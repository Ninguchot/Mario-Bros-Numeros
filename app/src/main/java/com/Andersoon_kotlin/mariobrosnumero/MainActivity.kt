package com.Andersoon_kotlin.mariobrosnumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.Andersoon_kotlin.mariobrosnumero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN // Esconder o StatusBar
    }
}