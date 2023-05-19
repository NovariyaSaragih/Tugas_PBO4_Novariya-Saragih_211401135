package films;

// Child class DramaFilm
public class DramaFilm extends Film implements FilmGenre {
    public DramaFilm(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void display() {
        System.out.println("Drama Film: " + title + ", Duration: " + duration + " minutes");
    }
}
