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

public class Menu extends AppCompatActivity {
    Button PM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        PM = (Button) findViewById(R.id.button12);

        PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Menu.this, Activity2.class);
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
