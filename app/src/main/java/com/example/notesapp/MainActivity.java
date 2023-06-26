package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;



public class MainActivity extends AppCompatActivity {

    MaterialButton matButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceed();
    }
    // This proceed function seeks to initialize the material button and to call a new activity to begin
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


    }
}