package proyecto.umb.promociones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        enviarbtn.setOnClickListener {

            val intent = Intent(this@Registro, Interna::class.java)
            var nombre :String = nombretxt.text.toString()
            var email :String = correotxt.text.toString()
            val datos : Bundle = Bundle()
            datos.putString("nombre", nombre)
            datos.putString("correo", email)
            intent.putExtras(datos)
            startActivity(intent)
        }

        nombretxt.setOnClickListener {
            var valTxt1: String = nombretxt.text.toString()
            if(valTxt1 == "Nombre"){
                nombretxt.setText("")
            }
        }

        correotxt.setOnClickListener {
            var valTxt2: String = correotxt.text.toString()
            if(valTxt2 == "Correo"){
                correotxt.setText("")
            }
        }
    }
}