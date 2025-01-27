// Declare the package name for this class
package com.pluralsight;

// Import required classes for input and string pattern matching
import java.util.Scanner;
import java.util.regex.Pattern;

// Class to determine the winner of a game based on scores
public class HighScoreWins {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt user to enter the game score
        System.out.print("Please enter a game score: ");
        
        // Read the input string (expected format: "TeamA:TeamB|Score1:Score2")
        String game_score = in.nextLine();
        
        // Split the input string in different ways to extract team names and scores
        // Split at ':' to get the second score
        String[] semi = game_score.split(Pattern.quote(":"));
        
        // Split at '|' to separate team names from scores
        String[] bar = game_score.split(Pattern.quote("|"));
        
        // Get the first score portion
        String first_number = bar[1];
        
        // Split the first score to get the actual number
        String [] new_bar = first_number.split(Pattern.quote(":"));
        
        // Get the team names portion
        String first_name = bar[0];
        
        // Split team names to get individual team names
        String [] final_bar = first_name.split(Pattern.quote(":"));
        
        // Extract individual team names
        String team_one = final_bar[0];
        String team_two = final_bar[1];
        
        // Convert score strings to integers for comparison
        int team_one_points = Integer.parseInt(new_bar[0]);
        int team_two_points = Integer.parseInt(semi[2]);
        
        // Debug print statements to verify scores
        System.out.println(new_bar[0]);
        System.out.println(semi[2]);
        
        // Compare scores and print the winner
        if (team_one_points > team_two_points)
        {
            System.out.printf("Winner: %s", team_one);
        }
        else
        {
            System.out.printf("Winner: %s", team_two);
        }
    }
}
