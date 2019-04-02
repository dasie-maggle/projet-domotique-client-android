package ironsecurity.ironsecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ChoixScenario extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private static String[] actions = {"-Choisir une action-","Allumer","Eteindre"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixscenario);

        // Récupération des IDs
        Spinner spin = (Spinner)findViewById(R.id.choix);
        spin.setOnItemSelectedListener(this);


        // Remplissage des spinners
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, actions);
        spin.setAdapter(aa);


        // Définition des écouteurs
        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        String selected =(String) parent.getAdapter().getItem(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0){

    }
}