package com.thoughtworks.spotify;

import com.thoughtworks.exception.SongAlreadyPresent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaylistTest {
    @Test
    public void shouldBeAbleToAddASongToThePlaylist() throws SongAlreadyPresent {
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        playlist.addSong(song);
        int actualSongCount = playlist.songsCount();

        assertEquals(actualSongCount, 1);
    }

    @Test
    public void shouldReturnSongAlreadyExistsExceptionWhenSongIsAlreadyPresentInPlaylist(){
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        assertThrows(SongAlreadyPresent.class, ()->{
            playlist.addSong(song);
        });

    }

}
