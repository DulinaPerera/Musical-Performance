package artist.backupArtist;

import artist.Artist;

public class BackupDancer extends Artist implements Backup {
    // Constructor to initialize a backup dancer
    public BackupDancer(String name) {
        super(name);
    }


    // Facilitator method to perform
    public void perform() {
        System.out.printf("%s is dancing.\n", this.getName());
        System.out.println("This is the {perform} method in {BackupDancer} class.");
    }


    // Facilitator method to back up
    public void backup() {
        System.out.printf("%s is dancing to backup the main singer.\n", this.getName());
        System.out.println("This is the {backup} method in {BackupDancer} class.");
    }
}
