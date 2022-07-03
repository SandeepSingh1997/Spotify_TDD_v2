package com.thoughtworks.spotify;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Playlist> playlists;

    public User() {
        this.playlists = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        this.playlists.add(playlist);
    }

    public int playlistsCount() {
        return playlists.size();
    }
}
