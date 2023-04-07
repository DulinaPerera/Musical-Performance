package performance;

public class StudioPerformance extends MusicalPerformance {
    // Constructor to initialize a studio performance
    public StudioPerformance(String mainArtistName, String name, int year, String venue) {
        super(mainArtistName, name, year, venue);
    }


    // Facilitator method to process audio
    public void processAudio() {
        System.out.println("Audio Processing...");
    }


    // Facilitator method to record the performance
    public void record() {
        System.out.println("Recording...");
        System.out.println("This is the {record} method in {StudioPerformance} class.");

    }
}
