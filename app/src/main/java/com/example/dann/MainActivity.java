package com.example.dann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton clothes_Activity_button;
    ImageButton food_Activity_button;
    ImageButton medicine_Activity_button;
    Button about_Activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clothes_Activity_button = (ImageButton) findViewById(R.id.clothesbutton);
        food_Activity_button = (ImageButton) findViewById(R.id.foodbutton);
        medicine_Activity_button = (ImageButton) findViewById(R.id.medicinebutton);
        about_Activity_button = (Button) findViewById(R.id.aboutbutton);

        clothes_Activity_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            startActivity(intent);
        });

        food_Activity_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,MainActivity3.class);

            startActivity(intent);
        });

        medicine_Activity_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,MainActivity4.class);

            startActivity(intent);
        });

        about_Activity_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,MainActivity6.class);

            startActivity(intent);
        });
    }
}