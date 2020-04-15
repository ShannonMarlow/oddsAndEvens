import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\" ");
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
                System.out.print(name + " wins, Well Done!");
            }else{
                System.out.print(" computer wins, better luck next time");
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
