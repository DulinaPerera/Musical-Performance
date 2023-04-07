package track;

import java.util.Objects;

public class Track {
    private final String name;
    private int duration; // in seconds

    // Constructor to initialize a music track(if the duration is not specified)
    public Track(String name) {
        this.name = name;
        this.duration = 0;
    }
    // Constructor to initialize a music track
    public Track(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    // Accessor to get the track name
    public String getName() {
        return name;
    }


    // Accessor to get the track duration
    public int getDuration() {
        return duration;
    }
    // Mutator to set the track duration
    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return duration == track.duration && Objects.equals(name, track.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, duration);
    }
}
