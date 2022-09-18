package com.example.dann;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        back_button = (Button) findViewById(R.id.backbutton);

        back_button.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity5.this,MainActivity.class);

            startActivity(intent);
        });
    }
}