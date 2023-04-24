package artist.backupArtist;

public interface Backup {
    // Default method 'backup' to be overridden by child classes
    public default void backup() {
        System.out.print("This is the {backup} method defined in the {Backup} interface. ");
    }
}
