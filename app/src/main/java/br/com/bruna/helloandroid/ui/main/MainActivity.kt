package br.com.bruna.helloandroid.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.bruna.helloandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val nome = intent.getStringExtra("nomeCliente")
        val telefone = intent.getStringExtra("telefoneCliente")

        labelNomeCliente.text = getString(R.string.label_oi, nome)

        setListeners()
        configViewModel()

    }

    fun configViewModel(){
        cbBrocolis.isChecked = mainViewModel.isBrocolisSelecionado
        cbPortuguesa.isChecked = mainViewModel.isPortuguesaSelecionado
        cbFrango.isChecked = mainViewModel.isFrangoSelecionado
        cbCalabresa.isChecked = mainViewModel.isCalabresaSelecionado
    }

    fun setListeners() {
        cbBrocolis.setOnCheckedChangeListener { buttonView, isChecked ->
            mainViewModel.isBrocolisSelecionado = isChecked
        }

        cbCalabresa.setOnCheckedChangeListener { buttonView, isChecked ->
            mainViewModel.isCalabresaSelecionado = isChecked
        }

        cbFrango.setOnCheckedChangeListener { buttonView, isChecked ->
            mainViewModel.isFrangoSelecionado = isChecked
        }

        cbPortuguesa.setOnCheckedChangeListener { buttonView, isChecked ->
            mainViewModel.isPortuguesaSelecionado = isChecked
        }
    }
}
