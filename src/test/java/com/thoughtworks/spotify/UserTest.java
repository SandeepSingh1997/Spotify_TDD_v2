package com.thoughtworks.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void shouldBeAbleToCreateAPlaylist(){
        User user = new User();

        user.createPlaylist("testPlaylist");
        int actualPlaylistCount = user.playlistsCount();

        assertEquals(actualPlaylistCount, 1);
    }
}
