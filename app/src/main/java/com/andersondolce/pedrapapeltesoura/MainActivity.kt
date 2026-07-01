package com.andersondolce.pedrapapeltesoura

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun selecionarPedra(view: View){
        verificarGanhador("pedra")
    }

    fun selecionarPapel(view: View){
        verificarGanhador("papel")
    }

    fun selecionarTesoura(view: View){
        verificarGanhador("tesoura")
    }

    private fun gerarEscolhaAleatoriaApp(): String {
        val opcoes = arrayOf("pedra", "papel", "tesoura")
        val numeroAleatorio = Random.nextInt(3)

        val imagemApp: ImageView = findViewById(R.id.image_app)
        val escolhaApp = opcoes[numeroAleatorio]

        when(escolhaApp){
            "pedra" -> imagemApp.setImageResource(R.drawable.pedra)
            "papel" -> imagemApp.setImageResource(R.drawable.papel)
            "tesoura" -> imagemApp.setImageResource(R.drawable.tesoura)
        }

        return escolhaApp
    }


    private fun verificarGanhador(escolhaUsuario: String) {
        val escolhaApp =  gerarEscolhaAleatoriaApp()
        val textoResultado = findViewById<TextView>(R.id.text_resultado)

        if((escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
            (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
            (escolhaApp == "tesoura" && escolhaUsuario == "papel")
            )
        {
            textoResultado.text = "Você perdeu!!"
        }else if((escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
            (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
             (escolhaUsuario == "tesoura" && escolhaApp == "papel")
            ){
            textoResultado.text = "Você ganhou!!"
        }else{
            textoResultado.text = "Empatamos!"
        }

    }



}