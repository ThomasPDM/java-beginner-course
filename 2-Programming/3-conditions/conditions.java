class conditions {

	public static void main(String[] args) {

		int year = 2020;
		boolean display = (1 == 2); // false

		System.out.println("\nIF ELSE");

		if (year != 2021) {
			System.out.println(year + " is not 2021");
		} else {
			System.out.println(year + " is 2021");
		} // 2020 is not 2021

		if (year >= 2001 && display) { // and
			System.out.println("21th century !");
		} //
		
		if (year >= 2001 || display) { // or
			System.out.println("21th century !");
		} // 21th century !


		System.out.println("\nSWITCH");

		switch (year) {
			case 2005: {
				System.out.println("it is 2005");
			} break;

			case 2000: {
				System.out.println("it is 2000");
			} break;

			default: {
				System.out.println("it is ....");
			} break;
		}
	}
}