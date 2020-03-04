package cl.dmix.desafiolatam.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private static final String LOGODESAFIOLATAM = "https://desafiolatam.com/assets/home/logo-academia-bla-790873cdf66b0e681dfbe640ace8a602f5330bec301c409744c358330e823ae3.png";

    private ImageView imagen;
    private EditText txtUser, txtPassword;
    private Button btnIngresar;
    final String USUARIO = "dmix";
    final String CONTRASEÑA = "123456";

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imagen);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnIngresar = findViewById(R.id.btnIngresar);
        
        Picasso.get().load(LOGODESAFIOLATAM).into(imagen);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botón Presionado", Toast.LENGTH_SHORT).show();
                if(String.valueOf(txtUser.getText()).equals(USUARIO) && String.valueOf(txtPassword.getText()).equals(CONTRASEÑA)) {
                    Toast.makeText(MainActivity.this, "Usuario Ingresado Correctamente.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
