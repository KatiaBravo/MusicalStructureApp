package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button favorites = (Button) findViewById(R.id.favorites);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritesIntent = new Intent(MainActivity.this, Favorites.class);

                startActivity(favoritesIntent);
            }
        });

        Button songs = (Button) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);

                startActivity(songsIntent);
            }
        });

        Button other = (Button) findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherIntent = new Intent(MainActivity.this, Other.class);

                startActivity(otherIntent);
            }
        });
    }
}
