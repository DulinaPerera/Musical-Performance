package artist;

import artist.Artist;

public class Singer extends Artist {
    // Constructor to initialize a singer
    public Singer(String name) {
        super(name);
    }


    // Facilitator method to perform
    public void perform() {
        System.out.printf("%s is singing.\n", this.getName());
        System.out.println("This is the {perform} method in {Singer} class.");
    }
}
