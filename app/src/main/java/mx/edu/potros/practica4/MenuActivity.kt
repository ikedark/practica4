package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.button_antojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.button_especialidades) as Button
        var btnCombinations: Button = findViewById(R.id.btn_combinations) as Button
        var btnTortas: Button = findViewById(R.id.btn_tortas) as Button

        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            var intent: Intent = Intent(this, EspecialidadesActivity::class.java)
            startActivity(intent)
        }

        btnCombinations.setOnClickListener {
            var intent: Intent = Intent(this, CombinationsActivity::class.java)
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            var intent: Intent = Intent(this, TortasActivity::class.java)
            startActivity(intent)
        }
    }
}