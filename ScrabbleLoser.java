import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ScrabbleLoser
{
    public static void main(String[] args) throws IOException
    {
        // Step 1: Create a File object for the CSV
        // Use "scrabble_games_sample.csv" for testing, then try "scrabble_games.csv"
        // TODO: Create the File object and a Scanner object using the File


        // Step 2: Create two parallel ArrayLists
        //   - One to store player names (String)
        //   - One to store the number of losses for each player (Integer)
        // TODO: Declare your ArrayLists here


        // Step 3: Skip the header row
        // TODO: Read and discard the first line


        // Step 4: Loop through each remaining line in the file
        // TODO: While the scanner has a next line...
        //   a. Read the line
        //   b. Split the line by commas into an array of Strings
        //   c. Extract the loser's name (column index 10)
        //   d. Check if this player is already in your names list
        //      - If YES: find their index and increment their loss count
        //      - If NO: add their name and set their loss count to 1


        // Step 5: Find the player with the most losses
        // TODO: Loop through your loss counts to find the maximum
        //   - Track the index of the maximum value
        //   - Use that index to get the player's name


        // Step 6: Print the result
        // TODO: Print the player name and their loss count


        // Don't forget to close your scanner!

    }
}
