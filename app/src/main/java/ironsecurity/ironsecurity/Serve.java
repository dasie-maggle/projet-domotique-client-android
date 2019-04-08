package ironsecurity.ironsecurity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Serve extends AppCompatActivity {
    EditText nameserve;
    EditText ip;
    Button valide;

    public static final String PREFS_SERV = "MyPrefsFileserv";
    private static final String PREF_Serveur = "saveserv";
    private static final String PREF_IP = "saveip";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixserveur);
        nameserve = (EditText) findViewById(R.id.editText);
        ip = (EditText) findViewById(R.id.editText4);
        valide = (Button) findViewById(R.id.button);

        valide.setOnClickListener(new View.OnClickListener() {


            public void onClick(View paramView)

            {
                String STRnameserve = nameserve.getText().toString();
                String STRip = ip.getText().toString();

                getSharedPreferences(PREFS_SERV,MODE_PRIVATE)
                        .edit()
                        .putString(PREF_Serveur, STRnameserve)
                        .putString(PREF_IP, STRip)

                        .commit();


            }});

        SharedPreferences pref = getSharedPreferences(PREFS_SERV,MODE_PRIVATE);
        nameserve.setText(pref.getString(PREF_Serveur, null));
        ip.setText(pref.getString(PREF_IP, null));
    }
}
