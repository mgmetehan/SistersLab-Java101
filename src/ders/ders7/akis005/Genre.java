package src.ders.ders7.akis005;

import java.util.ArrayList;
import java.util.List;

class Genre {
    private String genreName;
    private List<Song> songs;

    public Genre(String genreName) {
        this.genreName = genreName;
        this.songs = new ArrayList<>();
    }

    public void addSong(String songTitle, String artist) {
        Song song = new Song(songTitle, artist);
        songs.add(song);
    }

    public void displayGenreInfo() {
        System.out.println("M?zik T?r?: " + genreName);
        for (Song song : songs) {
            song.displaySongInfo();
        }
    }
}