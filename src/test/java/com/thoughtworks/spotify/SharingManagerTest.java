package com.thoughtworks.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharingManagerTest {
    @Test
    public void shouldBeAbleToSendPlaylistFromSenderToReceiver(){
        SharingManager sharingManager = new SharingManager();
        User sender = new User();
        User receiver = new User();
        Playlist playlist = new Playlist("testPlaylist");

        sharingManager.share(sender, receiver, playlist);
        int actualPlaylistCount = receiver.playlistsCount();

        assertEquals(1, actualPlaylistCount);
    }
}
