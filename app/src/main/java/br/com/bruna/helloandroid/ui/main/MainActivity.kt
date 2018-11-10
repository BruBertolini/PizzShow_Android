package br.com.bruna.helloandroid.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.bruna.helloandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = intent.getStringExtra("nomeCliente")
        val telefone = intent.getStringExtra("telefoneCliente")

        labelNomeCliente.text = getString(R.string.label_oi, nome)
    }
}
