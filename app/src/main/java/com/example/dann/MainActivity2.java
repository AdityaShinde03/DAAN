package com.example.dann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button back_button, proceed_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back_button = (Button) findViewById(R.id.backbutton);
        proceed_button = (Button) findViewById(R.id.proceedbutton);

        back_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });

        proceed_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
            startActivity(intent);
        });
    }
}