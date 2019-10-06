package com.example.bruno.musicstructureapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class ArtistsInformationPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists_information_page);
        TextView home = (TextView) findViewById(R.id.artist_home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsInformationPage.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView album = (TextView) findViewById(R.id.artist_album_button);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistsInformationPage.this, Albums.class);
                startActivity(albumIntent);
            }
        });
    }
}
