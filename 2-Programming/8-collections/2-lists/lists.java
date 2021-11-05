import java.util.ArrayList;

class lists {
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		// -> {}
		
		for (int i=0; i<10; i++) {
			integers.add(i*10);
		} // -> {0, 10, 20, 30, 40, 50, 60, 70, 80, 90}

		integers.remove(4); // remove at index 4
		// -> {0, 10, 20, 30, 50, 60, 70, 80, 90}

		for (int integer : integers) {
			System.out.print(integer + " ");
		}
		System.out.println("");


		integers.clear();
		// -> {}

		if (integers.isEmpty()) { // if list is empty
			integers.add(54);
			// -> {54}
		}

		System.out.println(integers.get(0)); // element at index 0
	}
}