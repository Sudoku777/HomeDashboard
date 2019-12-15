package com.example.homedashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Wifi extends AppCompatActivity {
       TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        final TextView myClickableUrl = (TextView) findViewById(R.id.button1);
        myClickableUrl.setText(" www.shop.az");
        Linkify.addLinks(myClickableUrl, Linkify.WEB_URLS);
    }
}
