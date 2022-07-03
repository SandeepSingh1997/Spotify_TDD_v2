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

        playlist.add(song);
        int actualSongCount = playlist.songsCount();

        assertEquals(actualSongCount, 1);
    }

    @Test
    public void shouldReturnSongAlreadyExistsExceptionWhenSongIsAlreadyPresentInPlaylist(){
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        assertThrows(SongAlreadyPresent.class, ()->{
            playlist.add(song);
        });
    }

    @Test
    public void shouldBeAbleToRemoveASongFromAPlaylistWhenItExistsInThePlaylist() throws SongAlreadyPresent {
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();
        playlist.add(song);

        playlist.remove(song);
        int actualSongsCount = playlist.songsCount();

        assertEquals(actualSongsCount, 0);
    }

}
