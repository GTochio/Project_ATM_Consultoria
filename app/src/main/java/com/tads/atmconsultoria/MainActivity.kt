package com.tads.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_contato.setOnClickListener{
            val intent = Intent(this, DetalhesContatoActivity::class.java)
            startActivity(intent)
        }
        button_clientes.setOnClickListener{
            val intent = Intent(this, DetalhesClienteActivity::class.java)
            startActivity(intent)
        }
        button_servicos.setOnClickListener{
            val intent = Intent(this, DetalhesServicoActivity::class.java)
            startActivity(intent)
        }
        button_empresa.setOnClickListener{
            val intent = Intent(this, DetalhesEmpresaActivity::class.java)
            startActivity(intent)
        }
    }
}
