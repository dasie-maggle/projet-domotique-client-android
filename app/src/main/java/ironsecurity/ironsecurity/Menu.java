package ironsecurity.ironsecurity;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    Button PM;
    Button CAM;
    Button SD;
    Button Mos;
    Button Stat;
    ImageButton OP;
    ImageButton PO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Stat = (Button) findViewById(R.id.button4);

        SD = (Button) findViewById(R.id.button11);

        PM = (Button) findViewById(R.id.button12);
        CAM = (Button) findViewById(R.id.button10);
        Mos = (Button) findViewById(R.id.button9);
        OP = (ImageButton) findViewById(R.id.Option);
        PO = (ImageButton) findViewById(R.id.Support);

        Stat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Stat.class);
                startActivity(i);
            }
        });

        CAM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Camera.class);
                startActivity(i);
            }
        });
        PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Activity2.class);
                startActivity(i);
            }
        });
        SD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, ChoixScenar.class);
                startActivity(i);
            }
        });

        Mos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Mosaique.class);
                startActivity(i);
            }
        });

        OP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Option.class);
                startActivity(i);
            }
        });

        PO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Propos.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        AlertDialog.Builder confirm = new AlertDialog.Builder(this);
        confirm.setMessage("Logout?");
        confirm.setTitle("Confirm");
        confirm.setPositiveButton("Yes", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialog, int which) {
                finish();
            }

        });
        confirm.setNegativeButton("No", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub

            }
        });

        confirm.show();

    }
}
