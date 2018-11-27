package com.example.als1543.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpAlert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_alert);

        sendButtonPress();
    }

    public void sendButtonPress() {
        final Button sendButton = (Button) findViewById(R.id.SendButton);
        sendButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sendButton.setText("SENT");
                sendButton.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
