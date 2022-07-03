package com.thoughtworks.spotify;

public class SharingManager {
    public void share(User user, User receiver, Playlist playlist) {
        receiver.add(playlist);
    }
}
