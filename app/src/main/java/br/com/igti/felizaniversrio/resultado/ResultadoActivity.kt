package br.com.igti.felizaniversrio.resultado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.igti.felizaniversrio.R
import br.com.igti.felizaniversrio.databinding.ActivityMainBinding
import br.com.igti.felizaniversrio.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        val view = binding.root

//        val resultadoIntent = intent.getStringExtra("EXEMPLO_INTENT")
//
//        binding.tvResultado.text = resultadoIntent

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(view)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                this.finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}