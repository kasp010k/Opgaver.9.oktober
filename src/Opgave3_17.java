import java.util.Scanner;

public class Opgave3_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 3);

        System.out.println("Choose 0 for Rock, 1 for Paper or 2 for Scissors.");
        int chosenNumber = input.nextInt();

        if (chosenNumber == 0) {
            System.out.println("You chose Rock");
            if (number == 0) {
                System.out.println("The computer chose Rock, it's a tie!");
            }
            if (number == 1) {
                System.out.println("The computer chose Paper, you loose!");
            }
            if (number == 2) {
                System.out.println("The computer chose Scissors, you win!");
            }
        }

        if (chosenNumber == 1) {
            System.out.println("You chose Paper");
            if (number == 0) {
                System.out.println("The computer chose Rock, you win!");
            }
            if (number == 1) {
                System.out.println("The computer chose Paper, it's a tie!");
            }
            if (number == 2) {
                System.out.println("The computer chose Scissors, you loose!");
            }
        }

        if (chosenNumber == 2) {
            System.out.println("You chose Scissors");
            if (number == 0) {
                System.out.println("The computer chose Rock, you loose!");
            }
            if (number == 1) {
                System.out.println("The computer chose Paper, you win!");
            }
            if (number == 2) {
                System.out.println("The computer chose Scissors, it's a tie!");
            }
        }





            }
        }


