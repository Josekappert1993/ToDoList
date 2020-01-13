package com.example.todolists;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_week_overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_overview);

        configerNextButton();
    }

    private void configerNextButton() {

        Button mondayButton = findViewById(R.id.monday_btn);
        mondayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Monday.class));
            }
        });
        Button tuesdayButton = findViewById(R.id.tuesday_btn);
        tuesdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Tuesday.class));
            }
        });
        Button wednesdayButton = findViewById(R.id.wednesday_btn);
        wednesdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Wednesday.class));
            }
        });
        Button thursdayButton = findViewById(R.id.thursday_btn);
        thursdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Thursday.class));
            }
        });
        Button fridayButton = findViewById(R.id.friday_btn);
        fridayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Friday.class));
            }
        });
        Button saturdayButton = findViewById(R.id.saturday_btn);
        saturdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Saturday.class));
            }
        });
        Button sundayButton = findViewById(R.id.sunday_btn);
        sundayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_week_overview.this, Sunday.class));
            }
        });
    }
}