package com.example.android.willywonkamusicapp;

/**
 * {@link Song} represents a song in the Willy Wonka Soundtrack.
 * It contains the song title and who the song was scored or sung by.
 */
public class Song {
    /**
     * Song title
     */
    private String mSongTitle;
    /**
     * Who the song was scored or sung by
     */
    private String mScoreSung;

    /**
     * Create a new Song object.
     *
     * @param SongTitle is the song title.
     * @param ScoreSung is who the song was scored or sung by
     */
    public Song(String SongTitle, String ScoreSung) {
        mSongTitle = SongTitle;
        mScoreSung = ScoreSung;
    }

    /**
     * Get the song title.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get who the song was scored or sung by
     */
    public String getScoreSung() {
        return mScoreSung;
    }
}
