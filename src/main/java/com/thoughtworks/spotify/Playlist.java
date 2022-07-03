package com.thoughtworks.spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private List<Song> songs;


    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public int songsCount() {
        return songs.size();
    }
}
