package com.example.joshua.fragmentlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    public final static String USER_NAME ="com.example.student.login1";
    public final static String PASSWORD ="com.example.student.login2";
    EditText user;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView;
        webView=(WebView) findViewById(R.id.web);
        webView.loadUrl("http://gsuit5236.s3-website-us-east-1.amazonaws.com/index.html");


    }
    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        user = (EditText)findViewById(R.id.USER);
        password = (EditText) findViewById(R.id.PASSWORD);

        String user1 = user.getText().toString();
        String pwd = password.getText().toString();

        intent.putExtra(USER_NAME, user1);
        intent.putExtra(PASSWORD, pwd);
        startActivity(intent);
    }
}
