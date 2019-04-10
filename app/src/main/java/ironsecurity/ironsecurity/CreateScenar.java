package ironsecurity.ironsecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CreateScenar extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private static String[] actions = {"-Choisir une action-","Allumer","Eteindre"};
    private static String[] Equipements = {"-Choisir l'équipement-", "Luminaires", "Appliques", "Projecteurs", "Hublots", "Ensembles de spots"};
    private static String[] Ext_Etages = {"-Choisir l'endroit-", "Extérieur","RDC","1er étage"};
    private static String[] Pieces = {"-Choisir la pièce-", "Bibliothéque", "Chambre invités", "Chambre invités - Salle de bain", "Chambre invités - Dressing",
            "Suite parentale", "Suite parentale - Salle de bain", "Suite parentale - Dressing", "Cuisine","Vestibule", "Escalier central", "Escalier est",
            "Garages nord","Garages ouest", "Hall nord", "Salle à manger", "Salon", "WC", "Placard"};
    private static String[] Temps = {"-Selectionner une durée-", "Sec","Min","Heures","Jours"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creerscenario);

        // Récupération des IDs
        Spinner spin = (Spinner)findViewById(R.id.Actions);
        spin.setOnItemSelectedListener(this);
        Spinner spin2 = (Spinner)findViewById(R.id.Equipements);
        spin.setOnItemSelectedListener(this);
        Spinner spin3 = (Spinner)findViewById(R.id.Ext_Etages);
        spin3.setOnItemSelectedListener(this);
        Spinner spin4 = (Spinner)findViewById(R.id.Pieces);
        spin4.setOnItemSelectedListener(this);
        Spinner spin5 = (Spinner)findViewById(R.id.Temps);
        spin5.setOnItemSelectedListener(this);

        // Remplissage des spinners
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, actions);
        spin.setAdapter(aa);
        ArrayAdapter<String> ab=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Equipements);
        spin2.setAdapter(ab);
        ArrayAdapter<String> ac=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Ext_Etages);
        spin3.setAdapter(ac);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Pieces);
        spin4.setAdapter(ad);
        ArrayAdapter<String> ae=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Temps);
        spin5.setAdapter(ae);

        // Définition des écouteurs
        spin.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);
        spin4.setOnItemSelectedListener(this);
        spin5.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        String selected =(String) parent.getAdapter().getItem(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0){

    }
}