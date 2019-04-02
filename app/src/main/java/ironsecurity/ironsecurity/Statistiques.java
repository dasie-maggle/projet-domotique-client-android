package ironsecurity.ironsecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Statistiques extends AppCompatActivity {

    private ListView stat1;
    private ArrayAdapter aAdapter;
    private String[] catégories = {"Appareils en fonction", "Consommation électrique", "Durée de fonctionnement", "Nombre de pannes"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistiques);

        stat1 = (ListView) findViewById(R.id.stats);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, catégories);
        stat1.setAdapter(aAdapter);
    }
}
