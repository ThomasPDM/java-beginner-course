import java.util.Scanner;

class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hellos ?");

        int numberOfHello = scanner.nextInt();

        for (int i=0; i<numberOfHello; i++) {
            System.out.println("hello");
        }

        scanner.close();
    }
}