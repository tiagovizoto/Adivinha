package com.cursodeandroid.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaoJogar;
    private TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rondamico = new Random();
                int numeroAleatorio = rondamico.nextInt(11);
                textoResultado.setText("Número escolhido: "+ numeroAleatorio);
            }
        });
    }


}
