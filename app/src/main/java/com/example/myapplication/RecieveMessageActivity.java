package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {
    public static final String Extramessage="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent=getIntent();
        String recievedmessage=intent.getStringExtra(Extramessage);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(recievedmessage);
    }
}