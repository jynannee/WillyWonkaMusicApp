package com.example.android.willywonkamusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the AlbumSongList page
        TextView songList = (TextView) findViewById(R.id.song_list);

        // Set a click listener on that View
        songList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, AlbumSongList.class);
                startActivity(songListIntent);
            }
        });

        // Find the View that shows the TicketSong page
        TextView ticket = (TextView) findViewById(R.id.ticket);

        // Set a click listener on that View
        ticket.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ticketIntent = new Intent(MainActivity.this, TicketSong.class);
                startActivity(ticketIntent);
            }
        });

        // Find the View that shows the OompaSong page
        TextView oompa = (TextView) findViewById(R.id.oompa);

        // Set a click listener on that View
        oompa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent oompaIntent = new Intent(MainActivity.this, OompaSong.class);
                startActivity(oompaIntent);
            }
        });

        // Find the View that shows the WonkataniaSong page
        TextView wonkatania = (TextView) findViewById(R.id.wonkatania);

        // Set a click listener on that View
        wonkatania.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent wonkataniaIntent = new Intent(MainActivity.this, WonkataniaSong.class);
                startActivity(wonkataniaIntent);
            }
        });

        // Find the View that shows the NowSong page
        TextView now = (TextView) findViewById(R.id.now);

        // Set a click listener on that View
        now.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, NowSong.class);
                startActivity(nowIntent);
            }
        });

    }
}
