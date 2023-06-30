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
        System.out.print("Enter a number: ");
        int line = input.nextInt();

        do {
            System.out.print("Enter a number: ");
            input.nextInt();

        } while (line == number);



        /*
        if (line > number) {
            System.out.println("Too Large");
        }
        else if (line < number) {
            System.out.println("Too Small");
        }
        else {
            System.out.println("Correct Guess");
        }
        //System.out.println(number);
        */

    }
}
