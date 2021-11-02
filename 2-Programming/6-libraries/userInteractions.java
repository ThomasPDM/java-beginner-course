import java.util.Scanner;

class userInteractions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's your name ?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);

		System.out.println("How hold are you ?");
		int age = scanner.nextInt();
		System.out.println("Oh ! You are " + age);

		scanner.close();
	}
}