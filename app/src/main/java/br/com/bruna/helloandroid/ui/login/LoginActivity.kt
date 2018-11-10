package br.com.bruna.helloandroid.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.bruna.helloandroid.R
import br.com.bruna.helloandroid.extension.value
import br.com.bruna.helloandroid.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnIniciar.setOnClickListener{
            iniciarPedido()

        }
    }

    private fun iniciarPedido() {
        val intent = Intent(this, MainActivity:: class.java)
        intent.putExtra("nomeCliente", inputNome.value())
        intent.putExtra("telefoneCliente", inputTelefone.value())
        startActivity(intent)

    }
}
