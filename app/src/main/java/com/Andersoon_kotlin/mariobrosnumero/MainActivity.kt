package com.Andersoon_kotlin.mariobrosnumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.Andersoon_kotlin.mariobrosnumero.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listaNumeros: MutableList<Int> = mutableListOf()

    private val listaImgs: MutableList<Int> = mutableListOf(
        R.drawable.n0, R.drawable.n1, R.drawable.n2, R.drawable.n3,
        R.drawable.n4, R.drawable.n5, R.drawable.n6, R.drawable.n7,
        R.drawable.n8, R.drawable.n9, R.drawable.n10,R.drawable.caixa
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN // Esconder o StatusBar
    }
    private fun gerarNumeroAleatorio(){

        for (n in 0..11){
            listaNumeros.add(n)
        }

        val numeroAleatorio = Random().nextInt(11)

        val imgNumero = when(numeroAleatorio){
            0 -> {
                listaImgs[0]
            }
            1 -> {
                listaImgs[1]
            }
            2 -> {
                listaImgs[2]
            }
            3 -> {
                listaImgs[3]
            }
            4 -> {
                listaImgs[4]
            }
            5 -> {
                listaImgs[5]
            }
            6 -> {
                listaImgs[6]
            }
            7 -> {
                listaImgs[7]
            }
            8 -> {
                listaImgs[8]
            }
            9 -> {
                listaImgs[9]
            }
            10 -> {
                listaImgs[10]
            }
            else -> {
                listaImgs[11]
            }
        }
    }
}