import java.util.HashMap;

class dictionnaries {
	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		// -> {}

		marks.put("Mathematics", 15);
		// -> {"Mathematics" => 15}

		marks.put("Computer science", 14);
		// -> {"Computer science" => 14, "Mathematics" => 15}

		marks.put("ups", 4);
		// -> {"Computer science" => 14, "ups" => 4, "Mathematics" => 15}

		marks.remove("ups");
		// -> {"Computer science" => 14, "Mathematics" => 15}
		

		System.out.println(marks.get("Computer science"));


		// print all domains
		for (String key : marks.keySet()) {
			System.out.println(key);
		}

		// print all marks
		for (int value : marks.values()) {
			System.out.println(value);
		}
	}
}