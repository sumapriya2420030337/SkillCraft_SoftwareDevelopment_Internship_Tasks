import java.util.Random;
import java.util.Scanner;

public class SCT_SD_2 {

    public static void main(String[] args) {

        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int randomNumber=random.nextInt(100) + 1;
        int guess;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 to 100");
        do{
            System.out.print("Enter your guess:");
            guess=sc.nextInt();

            if(guess>randomNumber) {
                System.out.println("Too high!Try again.");
            }else if(guess<randomNumber) {
                System.out.println("Too low!Try again.");
            }else{
                System.out.println("Congratulations!You guessed the correct number.");
            }

        }while (guess != randomNumber);

    }
}