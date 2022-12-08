package com.welder.blocodenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {



    private  anotacao preferencias;
    public EditText editAnotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fbSalvar = findViewById(R.id.floatingActionButton);
        editAnotacao = findViewById(R.id.txt);

        preferencias = new anotacao(getApplicationContext());


        fbSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoRecuperado = editAnotacao.getText().toString();

                if (textoRecuperado.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha a anotaçao!", Toast.LENGTH_LONG).show();
                    Log.i("INFO","click");
                }else {
                    preferencias.salvarAnotacao(textoRecuperado);
                    Toast.makeText(getApplicationContext(),"Anotaçao salva",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //reperar texto

        String anotacao = preferencias.recuperarAnotacao();

        if (!anotacao.equals("")){
            editAnotacao.setText(anotacao);
        }


         }
}