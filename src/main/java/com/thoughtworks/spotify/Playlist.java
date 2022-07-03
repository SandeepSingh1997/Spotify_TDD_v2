package com.thoughtworks.spotify;

import com.thoughtworks.exception.SongAlreadyPresent;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private List<Song> songs;


    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void add(Song song) throws SongAlreadyPresent {
        if(songs.contains(song)) throw new SongAlreadyPresent();
        this.songs.add(song);
    }

    public int songsCount() {
        return songs.size();
    }

    public void remove(Song song) {
        songs.remove(song);
    }
}
