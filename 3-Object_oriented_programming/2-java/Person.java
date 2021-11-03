public class Person {
	// Attributes
	private String firstName;
	private String lastName;
	private int age;

	// Methods
	public void printAttributes() {
		System.out.println(this.firstName + " " + this.lastName + " " + this.age + " years old");
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Constructors
	public Person() {

	}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
