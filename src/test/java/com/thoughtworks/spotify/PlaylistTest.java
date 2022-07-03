package com.thoughtworks.spotify;

import com.thoughtworks.exception.SongAlreadyPresentException;
import com.thoughtworks.exception.SongNotPresentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaylistTest {
    @Test
    public void shouldBeAbleToAddASongToThePlaylist() throws SongAlreadyPresentException {
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        playlist.add(song);
        int actualSongCount = playlist.songsCount();

        assertEquals(actualSongCount, 1);
    }

    @Test
    public void shouldReturnSongAlreadyExistsExceptionWhenSongAlreadyPresentInPlaylistIsAdded(){
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        assertThrows(SongAlreadyPresentException.class, ()->{
            playlist.add(song);
        });
    }

    @Test
    public void shouldBeAbleToRemoveASongFromAPlaylistWhenItExistsInThePlaylist() throws SongAlreadyPresentException, SongNotPresentException {
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();
        playlist.add(song);

        playlist.remove(song);
        int actualSongsCount = playlist.songsCount();

        assertEquals(actualSongsCount, 0);
    }

    @Test
    public void shouldReturnSongNotPresentExceptionWhenSongNotPresentInThePlaylistIsDeleted() throws SongAlreadyPresentException {
        Playlist playlist = new Playlist("testPlaylist");
        Song song = new Song();

        assertThrows(SongNotPresentException.class, ()->{
            playlist.remove(song);
        });
    }

}
