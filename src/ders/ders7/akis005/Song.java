package src.ders.ders7.akis005;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void displaySongInfo() {
        System.out.println("?ark?: " + title + " - Sanat??: " + artist);
    }
}
