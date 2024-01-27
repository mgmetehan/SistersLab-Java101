package src.ders.ders7.akis005;

public class Main {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary("MyLibrary");

        Genre popGenre = new Genre("Pop");

        popGenre.addSong("PopSong1", "PopArtist1");
        popGenre.addSong("PopSong2", "PopArtist2");

        Genre rockGenre = new Genre("Rock");
        rockGenre.addSong("RockSong1", "RockArtist1");
        rockGenre.addSong("RockSong2", "RockArtist2");
        rockGenre.displayGenreInfo();

        musicLibrary.addGenre("Pop");

        musicLibrary.displayLibraryInfo();
    }
}

