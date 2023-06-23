package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class NoteList extends AppCompatActivity {

    FloatingActionButton noteMaterialButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        start();
    }

    public void start(){
        noteMaterialButton =  findViewById(R.id.fab);
        noteMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(NoteList.this, addNote.class );
                startActivity(intent);
            }
        });
    }
}