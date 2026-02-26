import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ScrabbleLosses.java — Sample Solution
 *
 * Reads scrabble_games.csv (or the sample version) and determines
 * which player lost the most games.
 *
 * AP CSA–compliant: uses only Scanner, File, ArrayList, and String methods.
 */
public class ScrabbleLosses {
    public static void main(String[] args) throws IOException {
        // --- Step 1: Open the CSV file ---
        // Swap to "scrabble_games.csv" to run against the full dataset (~1.5 million
        // rows).
        // The sample file (~5 000 rows) runs much faster and is great for development.
        File file = new File("scrabble_games_sample.csv");
        Scanner scanner = new Scanner(file);

        // --- Step 2: Parallel ArrayLists ---
        // names.get(i) corresponds to lossCounts.get(i)
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> lossCounts = new ArrayList<Integer>();

        // --- Step 3: Skip the header row ---
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // discard header
        }

        // --- Step 4: Process every game row ---
        int linesRead = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Split the line on commas
            String[] columns = line.split(",");

            // The loser's name is in column index 10
            String loserName = columns[10];

            // Search for this name in our list
            int index = names.indexOf(loserName);

            if (index != -1) {
                // Player already tracked — increment their count
                lossCounts.set(index, lossCounts.get(index) + 1);
            } else {
                // New player — add them with a count of 1
                names.add(loserName);
                lossCounts.add(1);
            }

            linesRead++;
            // Optional progress indicator (helpful for large files)
            if (linesRead % 100000 == 0) {
                System.out.println("Processed " + linesRead + " games...");
            }
        }
        scanner.close();

        // --- Step 5: Find the maximum loss count ---
        int maxLosses = 0;
        int maxIndex = 0;

        for (int i = 0; i < lossCounts.size(); i++) {
            if (lossCounts.get(i) > maxLosses) {
                maxLosses = lossCounts.get(i);
                maxIndex = i;
            }
        }

        // --- Step 6: Print the result ---
        System.out.println("\nTotal games processed: " + linesRead);
        System.out.println("Total unique losers:   " + names.size());
        System.out.println();
        System.out.println("Player with the most losses:");
        System.out.println("  Name:   " + names.get(maxIndex));
        System.out.println("  Losses: " + maxLosses);
    }
}
