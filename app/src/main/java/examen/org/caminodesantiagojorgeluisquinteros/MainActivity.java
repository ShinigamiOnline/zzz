package examen.org.caminodesantiagojorgeluisquinteros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPreferencias = findViewById(R.id.btnPreferencias);
        btnPreferencias.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

        }

        });
    }

    private void llamarPreferencias(){
        Intent i = new Intent(this,PreferenciasActivity.class);
        startActivity(i);
    }
}
