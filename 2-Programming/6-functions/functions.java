class functions {
	static void function() {
		System.out.println("super function !");
	}

	static int function_int_returned() {
		return 12;
	}

	static int function_int_returned_with_parameters(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		function();

		int integer = function_int_returned();
		System.out.println(integer + " is an integer");

		int sum = function_int_returned_with_parameters(5, 4);
		System.out.println("5 + 4 = " + sum);
	}
}