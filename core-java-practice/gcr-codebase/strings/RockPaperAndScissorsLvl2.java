package gcr_codebase.strings;

import java.util.*;
public class RockPaperAndScissorsLvl2 {
    public static String computerChoice() {
        int c = (int) (Math.random() * 3);
        return c == 0 ? "rock" : c == 1 ? "paper" : "scissors";
    }
    public static String winnerFinder(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "user";
        return "comp";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWin = 0, computerWin = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = winnerFinder(user, comp);
            System.out.println("Computer: " + comp + " | Winner: " + winner);
            if (winner.equals("user")) userWin++;
            else if (winner.equals("comp")) computerWin++;
        }
        System.out.println("\nStats:");
        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + computerWin);
        System.out.printf("User Win %%: %.2f%%\n", (userWin * 100.0 / n));
        System.out.printf("Computer Win %%: %.2f%%\n", (computerWin * 100.0 / n));
    }
}

