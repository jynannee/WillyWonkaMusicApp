package com.example.android.willywonkamusicapp;

        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumSongList extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

            //Array with song information
            ArrayList<Song> songList = new ArrayList <>();

            songList.add(new Song("Main Title", "by Leslie Bricusse and Anthony Newley"));
            songList.add(new Song("The Candy Man", "by Aubrey Woods"));
            songList.add(new Song("Charlie's Paper Run", "by Leslie Bricusse and Anthony Newley"));
            songList.add(new Song("Cheer Up, Charlie", "by Diana Sowle"));
            songList.add(new Song("Lucky Charlie", "by Leslie Bricusse and Anthony Newley"));
            songList.add(new Song("(I've Got A) Golden Ticket", "by Jack Albertson and Peter Ostrum"));
            songList.add(new Song("Pure Imagination", "by Gene Wilder"));
            songList.add(new Song("Oompa Loompa", "by Oompa Loompa Cast"));
            songList.add(new Song("The Wondrous Boat Ride", "by Gene Wilder"));
            songList.add(new Song("Everlasting Gobstoppers/Oompa-Loompa", "by Oompa Loompa Cast"));
            songList.add(new Song("The Bubble Machine", "by Leslie Bricusse and Anthony Newley"));
            songList.add(new Song("I Want It Now/Oompa-Loompa", "by Julie Dawn Cole and Oompa Loompa Cast"));
            songList.add(new Song("Wonkamobile, Wonkavision", "by Oompa Loompa Cast"));
            songList.add(new Song("Wonkavator/End Title (Pure Imagination)", "by Leslie Bricusse and Anthony Newley"));

            SongAdapter adapter = new SongAdapter(this, songList);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
}