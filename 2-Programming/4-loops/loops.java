class loops {

	public static void main(String[] args) {
		int integer = 0;

		System.out.println("WHILE loop");
		while (integer < 6) {
			System.out.println(integer);
			integer++;
		}

		System.out.println("FOR loop");
		for (int i=0; i<6; i++) {
			System.out.println(i);
		}
	}
}