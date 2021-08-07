package br.utfpr.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewNomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewNomes = findViewById(R.id.listViewNomes);

        listViewNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {

                String nome = (String) listViewNomes.getItemAtPosition(posicao);

                Toast.makeText(getApplicationContext(), nome + getString(R.string.foi_clicado),
                        Toast.LENGTH_SHORT).show();            }
        });

        popularLista();
    }

    private void popularLista() {
        List<String> nomes = new ArrayList<>();

        nomes.add(getString(R.string.joao));
        nomes.add(getString(R.string.maria));
        nomes.add(getString(R.string.pedro));
        nomes.add(getString(R.string.marcos));
        nomes.add(getString(R.string.lucas));
        nomes.add(getString(R.string.andre));
        nomes.add(getString(R.string.mateus));
        nomes.add(getString(R.string.francisco));

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nomes);

        listViewNomes.setAdapter(adapter);

        
    }


}