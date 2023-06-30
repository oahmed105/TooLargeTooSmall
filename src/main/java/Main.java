import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int number = random.nextInt(5) + 1;
        Scanner input = new Scanner(System.in);
        int line = Integer.MAX_VALUE;
        int guess = Integer.MAX_VALUE;
        int guesses = 0;


        while (line > number || line < number) {
            System.out.print("Enter a number: ");
            line = input.nextInt();

            if (guess == line) {
                System.out.println("Guess a different number :( :");
                continue;
            }
            guesses++;
            if (line > number){
                System.out.println("Too large");
                guess = line;

            }

            else if (line < number) {
                System.out.println("Too small");
                guess = line;

            }
            }
            System.out.println("Correct guess!");
        System.out.println("You guessed correctly in " + guesses + " guesses :)");

        }
    }

