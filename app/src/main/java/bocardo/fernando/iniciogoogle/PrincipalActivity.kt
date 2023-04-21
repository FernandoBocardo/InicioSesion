package bocardo.fernando.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val bundle = intent.extras
        var tv_nombre = findViewById<TextView>(R.id.tv_nombre)
        var tv_email = findViewById<TextView>(R.id.tv_email)

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")

            tv_nombre.setText(name)
            tv_email.setText(email)
        }

        var btn_cerrar = findViewById<Button>(R.id.btn_cerrar)
        btn_cerrar.setOnClickListener{
            finish()
        }

    }

    override fun onBackPressed() {



    }
}