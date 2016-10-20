package com.example.joshua.fragmentlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String USER_NAME ="com.example.student.login1";
    public final static String PASSWORD ="com.example.student.login2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        WebView webView;
        webView=(WebView) findViewById(R.id.web);
        webView.loadUrl("http://gsuit5236.s3-website-us-east-1.amazonaws.com/index.html");

        Intent intent = getIntent();
        String user = intent.getStringExtra(USER_NAME);
        String pwd = intent.getStringExtra(PASSWORD);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("User: "+user+"\n"+"Password:"+pwd);

        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
