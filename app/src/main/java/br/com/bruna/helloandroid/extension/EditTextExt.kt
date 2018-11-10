package br.com.bruna.helloandroid.extension

import android.widget.EditText

fun EditText.value() = this.text.toString()