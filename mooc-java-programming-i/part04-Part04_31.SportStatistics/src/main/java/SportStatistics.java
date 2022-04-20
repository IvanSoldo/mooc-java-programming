
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String input = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        int gameCounter = 0;
        int winsCounter = 0;
        int lossesCounter = 0;

        try (Scanner fileReader = new Scanner(Paths.get(input))) {

            while (fileReader.hasNextLine()) {

                String[] parts = fileReader.nextLine().split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team) || awayTeam.equals(team)) {
                    gameCounter ++ ;

                    if (homeTeam.equals(team) && homeScore > awayScore) {
                        winsCounter ++ ;
                        continue;
                    }

                    if (awayTeam.equals(team) && awayScore > homeScore) {
                        winsCounter ++ ;
                        continue;
                    }

                    lossesCounter ++ ;

                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winsCounter);
        System.out.println("Losses: " + lossesCounter);

    }

}
