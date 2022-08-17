package com.example.teste1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> registro;

    @Override
// Setup das ações
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        Button btBuscar;
        EditText tPesquisa;
        registro = new ArrayList<>();
        ListView lvRegistro;
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, registro);

        // Setup evento de click
        btBuscar = findViewById(R.id.bt_buscar);
        tPesquisa = findViewById(R.id.et_pesquisa);
        lvRegistro = findViewById(R.id.lvRegistro);
        lvRegistro.setAdapter(adapter);
        btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tPesquisa.getText().toString();
//                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
                registro.add(text);
                adapter.notifyDataSetChanged();

            }

        });
    }
}