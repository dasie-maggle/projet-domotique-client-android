package ironsecurity.ironsecurity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Camera extends AppCompatActivity {
    Button Cam1;
    Button Cam2;
    Button Cam3;
    Button Cam4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixcamera);

        Cam1 = (Button) findViewById(R.id.button3);
        Cam2 = (Button) findViewById(R.id.button7);
        Cam3 = (Button) findViewById(R.id.button6);
        Cam4 = (Button) findViewById(R.id.button5);

        Cam1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent( Camera.this, Camera1.class);
                startActivity(i);
            }
        });

        Cam2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent( Camera.this, Camera2.class);
                startActivity(i);
            }
        });

        Cam3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent( Camera.this, Camera3.class);
                startActivity(i);
            }
        });

        Cam4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent( Camera.this, Camera4.class);
                startActivity(i);
            }
        });

    }
}