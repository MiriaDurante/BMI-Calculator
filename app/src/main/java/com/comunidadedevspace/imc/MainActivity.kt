package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Essa parte trás funcionalidade ao código
        //Recuperara elementos do editText
        //Criar uma variavel e associar (=) o componente de IU  <EditText>
        //Recuperar o botão da tela

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val adtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val pesostr: String = edtpeso.text.toString()
            val alturastr: String = adtaltura.text.toString()


            if (pesostr == "" || alturastr == "") {

                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {
                //Mostrar mensagem para usuario

                val peso = pesostr.toFloat()
                val altura = alturastr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("ação do botão" + resultado)
            }


        }


    }
}