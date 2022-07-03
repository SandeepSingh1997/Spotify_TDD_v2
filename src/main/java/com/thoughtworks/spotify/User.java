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
        add(playlist);
    }

    public int playlistsCount() {
        return playlists.size();
    }

    public void shareTo(User receiver, String playlistName) {
        SharingManager sharingManager = new SharingManager();
        Playlist playlist = getPlaylist(playlistName);
        sharingManager.share(this, receiver, playlist);
    }

    private Playlist getPlaylist(String playlistName) {
        return null;
    }

    public void add(Playlist playlist) {
        this.playlists.add(playlist);
    }
}
