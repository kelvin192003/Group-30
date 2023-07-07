package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;



public class MainActivity extends AppCompatActivity {

    MaterialButton matButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceed();
    }

    public void proceed(){
        matButton = findViewById(R.id.button_next);
        matButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, NoteList.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.imagePic);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, PremiumPage.class);
                startActivity(intent);
            }
        });


    }
}