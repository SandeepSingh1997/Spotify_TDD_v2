package com.thoughtworks.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {
    @Test
    public void shouldBeAbleToAddASongToThePlaylist(){
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        playlist.addSong(song);
        int actualSongCount = playlist.songsCount();

        assertEquals(actualSongCount, 1);
    }


}
