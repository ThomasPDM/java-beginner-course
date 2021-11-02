import java.util.Scanner;
import java.lang.Math;

public class ex2 {

    public static void main(String[] args) {
        int number = (int) (Math.random()*50);
        boolean asBeenFound = false;

        Scanner scanner = new Scanner(System.in);

        while (!asBeenFound) {
            System.out.println("guess the number [0,50] (press ctrl+c to leave)");
            int guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("more");
            } else {
                if (guess > number) {
                    System.out.println("less");
                } else {
                    asBeenFound = true;
                }
            }
        }

        System.out.println("you win !");

        scanner.close();
    }
}