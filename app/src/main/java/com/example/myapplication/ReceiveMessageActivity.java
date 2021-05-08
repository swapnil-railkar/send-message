package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String extraMessage = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String receivedMessage = intent.getStringExtra(extraMessage);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(receivedMessage);
    }
}