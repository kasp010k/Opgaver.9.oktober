import java.util.Scanner;

public class Opgave3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilos.");
        double weight = input.nextDouble();

        System.out.println("Enter height in meters.");
        double height =input.nextDouble();

        System.out.println("You're BMI is " + (weight / (height*height)));
    }
}
