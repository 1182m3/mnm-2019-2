package com.example.mnm_2019_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var segredo:TextView = findViewById(R.id.textView)
        var qtdErros:TextView = findViewById(R.id.textView2)
        var letra:EditText = findViewById(R.id.editText)
        var botao:Button = findViewById(R.id.button)
        var reiniciar:Button = findViewById(R.id.button2)


        var palavras = listOf<String>("Sábado", "Chuva", "Alegria")
        var erros = 0
        var acertos = mutableListOf<String>()
        var palavra = ""

        reiniciar.setOnClickListener{
            palavra = palavras.random()
            segredo.text = "_ ".repeat(palavra.count())
        }

        botao.setOnClickListener{
            var digito = letra.text.toString()
            var contemLetra = palavra.indexOf(digito)
            if (contemLetra > -1){
                acertos.add(digito)
            }
            else{
                erros = erros + 1
                qtdErros.text = "Erros $erros"
            }
        }
    }
}









//        var texto: TextView = findViewById(R.id.textView)
//        var texto2: TextView = findViewById(R.id.textView2)
//        var botao:Button = findViewById(R.id.button)
//        var input:EditText = findViewById(R.id.editText)
//        texto.text = "Meu Texto"
//        var numero = 1
//        var divisao = numero / 2
//        texto.text = divisao.toString()

//        var meutexto = "Meutexto"
//        texto.text = meutexto.get(1).toString()
//        var a = 1
//        texto2.text = "Digite o número " + a
//
//        botao.setOnClickListener {
//            if (input.text.toString() == a.toString()){
//            texto.text = "Número certo"
//            }
//            else {
//            texto.text = "Número errado"}
//        }

