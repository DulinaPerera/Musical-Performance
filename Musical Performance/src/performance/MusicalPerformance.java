package performance;

import artist.Singer;
import artist.backupArtist.BackupSinger;
import artist.backupArtist.BackupDancer;
import org.jetbrains.annotations.NotNull;
import track.Track;

import java.util.ArrayList;

public abstract class MusicalPerformance {
    private final Singer mainArtist;
    private String performanceName;
    private final String venue;
    private final int year;
    private final ArrayList<Track> trackList;
    private final ArrayList<BackupSinger> backupSingerList;
    private final ArrayList<BackupDancer> backupDancerList;

    // Constructor to initialize a musical performance
    public MusicalPerformance(String mainArtistName, String performanceName, int year, String venue) {
        this.mainArtist = new Singer(mainArtistName);
        this.performanceName = performanceName;
        this.year = year;
        this.venue = venue;

        trackList = new ArrayList<>();
        backupSingerList = new ArrayList<>();
        backupDancerList = new ArrayList<>();
    }


    // Accessor to get the main artist's name
    public String getMainArtistName() {
        return mainArtist.getName();
    }


    // Accessor to get the performance name
    public String getPerformanceName() {
        return performanceName;
    }
    // Mutator to set the performance name
    public void setPerformanceName(String newPerformanceName) {
        performanceName = newPerformanceName;
    }


    // Accessor to get the venue
    public String getVenue() {
        return venue;
    }


    // Accessor to get the year
    public int getYear() {
        return year;
    }


    // Add a track with unspecified 'duration' to 'trackList'.
    public void addTrack(String trackName) {
        // Create a 'Track' object.
        Track trackToAdd = new Track(trackName);

        /* If 'trackToAdd' is already present in the 'trackList', throw an error.
         * Else, add it to 'trackList'.
         */
        if (trackList.contains(trackToAdd)) {
            throw new DuplicateItemException("Duplicate track not allowed!");
        }

        trackList.add(trackToAdd);
    }
    // Add several tracks with unspecified duration to 'trackList'.
    public void addTracks(String @NotNull ... trackNames) {
        for (String trackName : trackNames) {
            // Create a 'Track' object.
            Track trackToAdd = new Track(trackName);

            /* If 'trackToAdd' is already present in the 'trackList', throw an error.
             * Else, add it to 'trackList'.
             */
            if (trackList.contains(trackToAdd)) {
                throw new DuplicateItemException("Duplicate track not allowed!");
            }

            trackList.add(trackToAdd);
        }
    }
    // Add a track to 'trackList'.
    public void addTrack(String trackName, int duration) {
        // Create a 'Track' object.
        Track trackToAdd = new Track(trackName, duration);

        /* If 'trackToAdd' is already present in the 'trackList', throw an error.
         * Else, add it to 'trackList'.
         */
        if (trackList.contains(trackToAdd)) {
            throw new DuplicateItemException("Duplicate track not allowed!");
        }

        trackList.add(trackToAdd);
    }


    // Add a backup singer to 'backupSingerList'.
    public void addBackupSinger(String name) {
        // Create a 'BackupSinger' object.
        BackupSinger backupSingerToAdd = new BackupSinger(name);

        /* If 'backupSingerToAdd' is already present in the 'backupSingerList', throw an error.
         * Else, add it to 'backupSingerList'.
         */
        if (backupSingerList.contains(backupSingerToAdd)) {
                throw new DuplicateItemException("Duplicate backup singer not allowed!");
            }

        backupSingerList.add(backupSingerToAdd);
    }
    // Add several backup singers to 'backupSingerList'.
    public void addBackupSingers(String @NotNull ... names) {
        for (String name : names) {
            // Create a 'BackupSinger' object.
            BackupSinger backupSingerToAdd = new BackupSinger(name);

            /* If 'backupSingerToAdd' is already present in the 'backupSingerList', throw an error.
             * Else, add it to 'backupSingerList'.
             */
            if (backupSingerList.contains(backupSingerToAdd)) {
                throw new DuplicateItemException("Duplicate backup singer not allowed!");
            }

            backupSingerList.add(backupSingerToAdd);
        }
    }


    // Add a backup dancer to 'backupDancerList'.
    public void addBackupDancer(String name) {
        // Create a 'BackupSinger' object.
        BackupDancer backupDancerToAdd = new BackupDancer(name);

        /* If 'backupDancerToAdd' is already present in the 'backupDancerList', throw an error.
         * Else, add it to 'backupDancerList'.
         */
        if (backupDancerList.contains(backupDancerToAdd)) {
                throw new DuplicateItemException("Duplicate backup dancer not allowed!");
            }

        backupDancerList.add(backupDancerToAdd);
    }
    // Add several backup dancers to 'backupDancerList'.
    public void addBackupDancers(String @NotNull ... names) {
        for (String name : names) {
            // Create a 'BackupSinger' object.
            BackupDancer backupDancerToAdd = new BackupDancer(name);

            /* If 'backupDancerToAdd' is already present in the 'backupDancerList', throw an error.
             * Else, add it to 'backupDancerList'.
             */
            if (backupDancerList.contains(backupDancerToAdd)) {
                throw new DuplicateItemException("Duplicate backup dancer not allowed!");
            }

            backupDancerList.add(backupDancerToAdd);
        }

    }


    // Facilitator method to start the performance
    public void startPerformance() {
        System.out.printf("Welcome to '%s' by '%s'!\n", this.getPerformanceName(), this.getMainArtistName());
        mainArtist.perform();

        for (BackupSinger backupSinger : backupSingerList) {
            backupSinger.backup();
        }
        for (BackupDancer backupDancer : backupDancerList) {
            backupDancer.backup();
        }
    }


    // Abstract method 'record' to be implemented by child classes
    public abstract void record();
}
