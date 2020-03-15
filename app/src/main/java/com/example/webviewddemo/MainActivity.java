package com.example.webviewddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String weburl = "https://std116708.github.io/leafletMapV2.1/"; //Default Android URL for Local Host --> http://10.0.2.2::5501

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadWebPage(View view) {
        WebViewFragment webViewFragment = new WebViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, webViewFragment).commit();

    }
}
