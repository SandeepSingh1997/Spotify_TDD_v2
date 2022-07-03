package com.thoughtworks.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void shouldBeAbleToCreateAPlaylist(){
        User user = new User();

        user.createPlaylist("testPlaylist");
        int actualPlaylistCount = user.playlistsCount();

        assertEquals(1, actualPlaylistCount);
    }

    @Test
    public void shouldBeAbleToSharePlaylistToAnotherUser(){
        User sender = new User();
        sender.createPlaylist("testPlaylist");
        User receiver = new User();

        sender.shareTo(receiver, "testPlaylist");
        int actualPlaylistCount = receiver.playlistsCount();

        assertEquals(1,actualPlaylistCount);
    }

}
