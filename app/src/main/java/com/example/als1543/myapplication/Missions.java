package com.example.als1543.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Missions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missions);

        TextView humanCount = findViewById(R.id.humanCount);
        humanCount.setText("452");
        TextView zombieCount = findViewById(R.id.zombieCount);
        zombieCount.setText("170");

        TextView fridayText = findViewById(R.id.fridayText);
        fridayText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
        TextView thursText = findViewById(R.id.thursdayText);
        thursText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
        TextView wedText = findViewById(R.id.wednesdayText);
        wedText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
        TextView tuesText = findViewById(R.id.tuesdayText);
        tuesText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
        TextView monText = findViewById(R.id.mondayText);
        monText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
        TextView sunText = findViewById(R.id.sundayText);
        sunText.setText("Midday Mission: Description\nNight Mission: Description\nStory: Story text");
    }
}
