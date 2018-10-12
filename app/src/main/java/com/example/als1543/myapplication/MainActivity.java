package com.example.als1543.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView humanCount = findViewById(R.id.humanCount);
        humanCount.setText("452");
        TextView zombieCount = findViewById(R.id.zombieCount);
        zombieCount.setText("170");

        goToMissions();
    }

    public void goToMissions() {
        Button toMissions = (Button) findViewById(R.id.toMissionsButton);
        toMissions.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, Missions.class));
            }
        });
    }
}
