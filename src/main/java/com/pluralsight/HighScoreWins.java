package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String game_score = in.nextLine();

        String[] semi = game_score.split(Pattern.quote(":"));
        String[] bar = game_score.split(Pattern.quote("|"));
        String first_number = bar[1];
        String [] new_bar = first_number.split(Pattern.quote(":"));
        String first_name = bar[0];
        String [] final_bar = first_name.split(Pattern.quote(":"));

        String team_one = final_bar[0];
        String team_two = final_bar[1];

        int team_one_points = Integer.parseInt(new_bar[0]);
        int team_two_points = Integer.parseInt(semi[2]);

        System.out.println(new_bar[0]);
        System.out.println(semi[2]);


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
