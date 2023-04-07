package performance;

public class LivePerformance extends MusicalPerformance {
    // Constructor to initialize a live performance
    public LivePerformance(String mainArtistName, String name, int year, String venue) {
        super(mainArtistName, name, year, venue);
    }


    // Facilitator method to interact with the audience
    public void interact() {
        System.out.println("Let's interact.");
        System.out.println("This is the {interact} method in {LivePerformance} class.");
    }


    // Facilitator method to record the performance
    public void record() {
        System.out.println("Recording...");
        System.out.println("This is the {record} method in {LivePerformance} class.");
    }
}
