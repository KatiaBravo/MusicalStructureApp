package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button podcasts = (Button) findViewById(R.id.podcasts);
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent podcastIntent = new Intent(Other.this, PodcastsActivity.class);

                startActivity(podcastIntent);
            }
        });

        Button audiobooks = (Button) findViewById(R.id.audiobooks);
        audiobooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent audiobookIntent = new Intent(Other.this, AudioBooksActivity.class);

                startActivity(audiobookIntent);
            }
        });
    }
}
