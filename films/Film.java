package films;

// Abstract class Film
public abstract class Film {
    protected String title;
    protected int duration;

    public Film(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract void display();

    // Inner class Actor
    public class Actor {
        private String name;
        private int age;

        public Actor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Actor: " + name + ", Age: " + age);
        }
    }

    public void displayGenre() {
    }
}
