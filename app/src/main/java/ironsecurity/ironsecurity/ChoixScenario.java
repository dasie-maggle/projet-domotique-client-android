package ironsecurity.ironsecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.concurrent.atomic.AtomicReference;

public class ChoixScenario extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private static String[] actions = {"Choisissez un scénario","scénario 1","scénario 2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixscenario);

        // Récupération des IDs
        Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        // Remplissage des spinners
        ArrayAdapter aa=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, actions);
        spin.setAdapter(aa);


        // Définition des écouteurs
        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        AtomicReference<String> selected = new AtomicReference<>((String) parent.getAdapter().getItem(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0){

    }
}