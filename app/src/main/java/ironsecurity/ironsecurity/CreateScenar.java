package ironsecurity.ironsecurity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateScenar extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] actions = {"Choisir une action", "Allumer", "Eteindre"};
    String[] actions2= {"ok", "hey", "yo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creerscenario);

        Spinner spin = findViewById(R.id.Actions);
        spin.setOnItemSelectedListener(this);
        Spinner spin2 = findViewById(R.id.Ext_Etages);
        spin2.setOnItemSelectedListener(this);

        ArrayAdapter aa= new ArrayAdapter(this, android.R.layout.simple_spinner_item, actions);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        ArrayAdapter ab= new ArrayAdapter(this, android.R.layout.simple_spinner_item, actions2);
        ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(ab);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),actions[position], Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),actions2[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0) {

    }
}