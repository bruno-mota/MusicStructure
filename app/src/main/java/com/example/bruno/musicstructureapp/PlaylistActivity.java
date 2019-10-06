package com.example.bruno.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        TextView home = (TextView) findViewById(R.id.artist_home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView playlist = (TextView) findViewById(R.id.artist_playlist_button);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playistIntent = new Intent(PlaylistActivity.this, ArtistsActivity.class);
                startActivity(playistIntent);
            }
        });
    }
}
