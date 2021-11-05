class variables {

	public static void main(String[] args) {
		// Declare variables
		int year = 2021;
		double real = 5.2648;
		char letter = 'a';
		String alphabet = "abcdefgh...y";
		boolean isHappy = false;

		// Modify variables
		year = year + 1; // year+=1; year++;
		real = real + 1.4; // real += 1.4;
		alphabet = alphabet + "z"; // alphabet += "z";
		isHappy = !isHappy; // !false = true

		// Display
		System.out.println(year);
		System.out.println(real);
		System.out.println(letter);
		System.out.println(alphabet);
		System.out.println(isHappy);
	}
}