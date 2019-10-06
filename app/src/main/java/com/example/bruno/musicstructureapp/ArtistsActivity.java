package com.example.bruno.musicstructureapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        TextView artist1 = (TextView) findViewById(R.id.artist_name_one);
        artist1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent artistNameIntent = new Intent(ArtistsActivity.this, ArtistsInformationPage.class);
                startActivity(artistNameIntent);
            }
        });
        TextView artist2 = (TextView) findViewById(R.id.artist_name_two);
        artist2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent artistNameIntent = new Intent(ArtistsActivity.this, ArtistsInformationPage.class);
                startActivity(artistNameIntent);
            }
        });
        TextView artist3 = (TextView) findViewById(R.id.artist_name_three);
        artist3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent artistNameIntent = new Intent(ArtistsActivity.this, ArtistsInformationPage.class);
                startActivity(artistNameIntent);
            }
        });
        TextView artist4 = (TextView) findViewById(R.id.artist_name_four);
        artist4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent artistNameIntent = new Intent(ArtistsActivity.this, ArtistsInformationPage.class);
                startActivity(artistNameIntent);
            }
        });
        TextView home = (TextView) findViewById(R.id.artist_home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView playlist = (TextView) findViewById(R.id.artist_playlist_button);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
