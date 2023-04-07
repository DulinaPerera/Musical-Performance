package artist;

import java.util.Objects;

public abstract class Artist {
    private final String name;

    // Constructor to initialize an artist
    public Artist(String name) {
        this.name = name;
    }


    // Accessor to get the artist's name
    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    // Abstract method 'perform' to be implemented by child classes
    public abstract void perform();
}
