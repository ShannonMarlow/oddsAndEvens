import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\" ");
        System.out.println("\n---------------------------------------------\n");
        System.out.print("\nHere are the rules: \n" +
                "The game is similar to rock paper scissors. It is played between two players, \n" +
                "in your version it will be you versus the computer. \n" +
                "Each player will choose either \"odds\" or \"evens\", since you’re playing the computer you will get first pick. \n" +
                "Once you have chosen your side, you each choose a number of fingers to play- 0 to 5. \n" +
                "The winner is determined by whether the sum of your fingers is odd or even (depending on what you chose).\n" +
                "For example, let’s say you choose \"evens\". That means the computer gets \"odds\". \n" +
                "You choose to play 2 fingers and the computer plays 3. 2 + 3 = 5, which is odd so the computer wins.\n");
        System.out.println("\n---------------------------------------------\n");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + " which do you choose? (O)dds or (E)vens? ");
        String team = input.next();
        if (team.equals("O") || team.equals("o")) {
            System.out.print(name + " has picked odds! The computer will be evens");
        } else {
            System.out.print(name + " has picked evens! The computer will be odds");
        }
        System.out.println("\n---------------------------------------------\n");
        Random rand = new Random();
        System.out.print("How many \"fingers\" do you want to play? ");
        int fingers = input.nextInt();
        System.out.println("You played " + fingers + " \"fingers\"");
        int computer = rand.nextInt(6);
        System.out.print("\nThe computer plays: " + computer + " \"fingers\"");
        System.out.println("\n---------------------------------------------\n");
        int sum = (fingers + computer);
        System.out.println(fingers + "+" + computer + "=" + sum);
        if (sum % 2 == 0) {
            System.out.print(sum + " is even ");
            if(team.equalsIgnoreCase("o")){
                System.out.print(" computer wins, better luck next time");
            }else{
                System.out.print(name + " wins, Well Done!");
            }
        } else {
            System.out.print(sum + " is odd ");
            if(!team.equalsIgnoreCase("o")){
                System.out.print(" computer wins, better luck next time");
            } else{
                System.out.print(name + " wins, Well Done!");
            }
        }
        System.out.println("\n---------------------------------------------\n");

    }
}
