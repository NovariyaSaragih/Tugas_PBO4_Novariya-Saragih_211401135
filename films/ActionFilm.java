package films;

// Child class ActionFilm
public class ActionFilm extends Film implements FilmGenre {
    public ActionFilm(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void display() {
        System.out.println("Action Film: " + title + ", Duration: " + duration + " minutes");
    }

    /**
     * 
     */
   
}
