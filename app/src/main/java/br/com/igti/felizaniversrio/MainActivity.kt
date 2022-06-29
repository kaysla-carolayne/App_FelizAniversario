package br.com.igti.felizaniversrio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.igti.felizaniversrio.databinding.ActivityMainBinding
import br.com.igti.felizaniversrio.resultado.ResultadoActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btnEnviar.setOnClickListener{
            Toast.makeText(this, getString(R.string.texto_toast),Toast.LENGTH_LONG).show()
            val intent = Intent(this, ResultadoActivity::class.java)

            intent.putExtra("EXEMPLO_INTENT", "IGTI--ANDROID")

            startActivity(intent)
        }

        setContentView(view)
    }
}