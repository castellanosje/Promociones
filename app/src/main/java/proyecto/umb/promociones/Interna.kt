package proyecto.umb.promociones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interna.*

class Interna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interna)

        var bundle = intent.extras
        if (bundle != null) {
            nombreinterna.text = bundle.getString("nombre")
            correointerna.text = bundle.getString("correo")
        }

    }
}