class Person {
	// Attributes
	String firstName;
	String lastName;
	int age;

	// Methods
	void printAttributes() {
		System.out.println(this.firstName + " " + this.lastName + " " + this.age + " years old");
	}

	// Constructors
	Person() {

	}
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}