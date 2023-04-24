package artist.backupArtist;

import artist.Singer;

public class BackupSinger extends Singer implements Backup {
    // Constructor to initialize a backup singer
    public BackupSinger(String name) {
        super(name);
    }


    // Facilitator method to back up
    @Override
    public void backup() {
        System.out.printf("%s is singing to backup the main singer.\n", this.getName());
        Backup.super.backup();
        System.out.println("And it is overridden in the {BackupSinger} class.\n");
    }
}
