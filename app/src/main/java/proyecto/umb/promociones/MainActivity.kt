package proyecto.umb.promociones

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import proyecto.umb.promociones.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bindeamos el evento de click para ingresar al registro
        ingresar.setOnClickListener {
            startActivity(Intent(this,Registro::class.java))
        }
    }
}