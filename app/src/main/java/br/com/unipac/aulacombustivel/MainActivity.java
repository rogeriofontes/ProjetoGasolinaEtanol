package br.com.unipac.aulacombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText edVlrGasolina, edVlrEtanol;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edVlrGasolina = (EditText) findViewById(R.id.edVlrGasolina);
        edVlrEtanol = (EditText) findViewById(R.id.edVlrEtanol);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valorGasolina = Double.parseDouble(edVlrGasolina.getText().toString());
                Double valorEtanol = Double.parseDouble(edVlrEtanol.getText().toString());

                double i = valorEtanol / valorGasolina;

                if (i > 0.7) {
                    Toast.makeText(MainActivity.this, "Compensa gasolina", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Compensa Etanol", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
