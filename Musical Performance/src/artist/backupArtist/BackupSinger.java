package artist.backupArtist;

import artist.Singer;

public class BackupSinger extends Singer implements Backup {
    // Constructor to initialize a backup singer
    public BackupSinger(String name) {
        super(name);
    }


    // Facilitator method to back up
    public void backup() {
        System.out.printf("%s is singing to backup the main singer.\n", this.getName());
        System.out.println("This is the {backup} method in {BackupSinger} class.");
    }
}
