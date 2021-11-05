class arrays {

	public static void main(String[] args) {
		int[] integers = new int[10];
		// -> {  ,  ,  ,  ,  ,  ,  ,  ,  , }

		for (int i=0; i<10; i++) {
			integers[i] = i*10;
		} // -> {0, 10, 20, 30, 40, 50, 60, 70, 80, 90}

		for (int integer : integers) {
			System.out.println(integer);
		}
	}
}