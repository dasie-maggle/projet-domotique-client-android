package ironsecurity.ironsecurity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {
    Button RDC;
    Button Garage;
    Button PEtage;
    Button Exte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        RDC = (Button) findViewById(R.id.button5);
        Garage = (Button) findViewById(R.id.button3);
        PEtage = (Button) findViewById(R.id.button6);
        Exte = (Button) findViewById(R.id.button7);

        Garage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Activity2.this, Garage.class);
                startActivity(i);
            }
        });
        PEtage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Activity2.this, PremierEtage.class);
                startActivity(i);
            }
        });

        RDC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Activity2.this, Activity3.class);
                startActivity(i);
            }
        });
        Exte.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Activity2.this, Exterieur.class);
                startActivity(i);
            }
        });

    }
}
