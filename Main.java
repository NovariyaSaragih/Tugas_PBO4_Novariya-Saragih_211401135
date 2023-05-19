import films.ActionFilm;
import films.DramaFilm;
import films.Film;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ActionFilm
        Film actionFilm = new ActionFilm("The Avengers", 143);
        actionFilm.display();
        actionFilm.displayGenre();

        // Membuat objek Inner class Actor
        Film.Actor actor1 = actionFilm.new Actor("Robert Downey Jr", 56);
        actor1.display();

        // Membuat objek DramaFilm
        Film dramaFilm = new DramaFilm("The Shawshank Redemption", 142);
        dramaFilm.display();
        dramaFilm.displayGenre();

        Film.Actor actor2 = dramaFilm.new Actor("Tim Robbins", 63);
        actor2.display();
    }
}
