package ironsecurity.ironsecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CreateScenar extends AppCompatActivity {

    private ListView Action;
    private String[] actions = new String[] {
            "Allumer", "Eteindre"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creerscenario);

        Action = (ListView) findViewById(R.id.action);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(CreateScenar.this, android.R.layout.simple_list_item_1, actions);
        Action.setAdapter(adapter);
    }
}
