public class Main {
    public static void main(String[] args) {
        Group group = new Group("Team");
        group.addMember("Bob", 28);
        group.addMember("Patrick", 24);
        group.addMember("Carlos", 35);

        group.printGroupInfo();
        group.setName("Super Team");
        group.printGroupInfo();

        System.out.println("Bob is " + group.getAge("Bob"));
    }
}