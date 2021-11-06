import java.util.Scanner;

class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what's your name ?");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}