package src.ders.ders7.akis005;

import java.util.ArrayList;
import java.util.List;

class MusicLibrary {
    private String libraryName;
    private List<Genre> genres;

    public MusicLibrary(String libraryName) {
        this.libraryName = libraryName;
        this.genres = new ArrayList<>();
    }

    public void addGenre(String genreName) {
        Genre genre = new Genre(genreName);
        genres.add(genre);
    }

    public void displayLibraryInfo() {
        System.out.println("M?zik K?t?phanesi: " + libraryName);
        for (Genre genre : genres) {
            genre.displayGenreInfo();
        }
    }
}

/*
1. `MusicLibrary` Sinifi:
   - `MusicLibrary` sinifi, muzik kutuphanesini temsil eder.
   - Her muzik kutuphanesi bir isme (`libraryName`) sahiptir.
   - Muzik kutuphanesi icindeki muzik turleri `Genre` siniflariyla temsil edilir.
   - `addGenre` metodu, yeni bir muzik turu eklemek icin kullanilir.
   - `displayLibraryInfo` metodu, muzik kutuphanesi hakkinda bilgileri ekrana yazdirmak icin kullanilir.

2. `Genre` Sinifi (Ic Ice):
   - `Genre` sinifi, bir muzik turunu temsil eder.
   - Her muzik turu bir isme (`genreName`) sahiptir.
   - Her muzik turu icinde sarkilari temsil etmek uzere `Song` siniflari icerir.
   - `addSong` metodu, yeni bir sarki eklemek icin kullanilir.
   - `displayGenreInfo` metodu, muzik turu hakkinda bilgileri ekrana yazdirmak icin kullanilir.

3. `Song` Sinifi (Ic Ice):
   - `Song` sinifi, bir sarkiyi temsil eder.
   - Her sarkinin bir basligi (`title`) ve bir sanatcisi (`artist`) vardir.
   - `displaySongInfo` metodu, sarki hakkinda bilgileri ekrana yazdirmak icin kullanilir.

Mantik su sekildedir:
- `MusicLibrary` sinifi, muzik kutuphanesini olusturur ve icinde muzik turlerini barindirir.
- `Genre` sinifi, bir muzik turunu temsil eder ve icindeki sarkilari yonetir.
- `Song` sinifi, bir sarkiyi temsil eder.

 */