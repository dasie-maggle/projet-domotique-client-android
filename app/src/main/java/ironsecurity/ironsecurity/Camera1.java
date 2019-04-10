import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import ironsecurity.ironsecurity.R;

class MainActivity extends AppCompatActivity {

    Button btnUp;
    Button btnDown;
    Button btnLeft;
    Button btnRight;
    WebView webView;
    String urlUp;
    String urlDown;
    String urlLeft;
    String urlRight;
    URL url;
    HttpURLConnection urlConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera1);

        btnUp = findViewById( R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        webView = findViewById(R.id.webView);

        urlUp = "http://172.16.3.14/pantiltcontrol.cgi?PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=1";
        urlDown = "http://172.16.3.14/pantiltcontrol.cgi?PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=7";
        urlLeft = "http://172.16.3.14/pantiltcontrol.cgi?PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=3";
        urlRight = "http://172.16.3.14/pantiltcontrol.cgi?PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=5";

        try {
            url = new URL("http://172.16.3.14/pantiltcontrol.cgi?PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        webView.loadUrl("http://admin:@172.16.3.14/video.cgi");

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(urlUp);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //requestQueue.add(requestDown);
                webView.loadUrl(urlDown);
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(urlLeft);
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(urlRight);
            }
        });
    }







}