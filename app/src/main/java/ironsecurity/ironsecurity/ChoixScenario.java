package ironsecurity.ironsecurity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ChoixScenario extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] action = {"Choisir un scenario", "scenario 1", "scenario 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixscenario);

        Spinner spin = findViewById(R.id.choix);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item, action);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),action[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0) {

    }
}