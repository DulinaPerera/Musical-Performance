package performance;

public class Body {
    public static void main(String[] args) {
        // Create a new live performance object.
        LivePerformance erasTour = new LivePerformance("Taylor Swift", "Eras Tour", 2023, "Glendale") {{
            addTracks("Lavender Haze", "All Too Well", "the lakes", "The Man", "Love Story");

            addBackupSingers("Jeslyn", "Melanie");

            addBackupDancers("Stephanie", "Jake");
        }};

        erasTour.startPerformance(); // Start the performance.
    }
}
