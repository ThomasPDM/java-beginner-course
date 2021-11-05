public class Main {
    public static void main(String[] args) {
        School school = new School("La Rochelle Université", "university", "La Rochelle");
        school.addDomain("psychology");
        school.addDomain("mathematics");
        school.addDomain("medecine...");

        System.out.println(school.getName() + ", " + school.getType() + " of " + school.getCity());
        school.printDomains();
    }
}