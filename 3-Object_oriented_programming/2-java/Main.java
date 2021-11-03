public class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setFirstName("David");
		person1.setLastName("Tennant");
		person1.setAge(50);
		person1.printAttributes();

		Person person2 = new Person("Math", "Smith", 39);
		person2.printAttributes();
	}
}