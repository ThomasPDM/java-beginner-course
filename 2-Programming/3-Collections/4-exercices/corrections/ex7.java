public class ex7 {

    static void display(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] companions = {"Rose", "Martha", "Donna", "Amy", "Clara", "Bill"};

        /*
            String[] companions = new String[6];
            companions[0] = "Rose";
            companions[1] = "Martha";
            companions[2] = "Donna";
            companions[3] = "Amy";
            companions[4] = "Clara";
            companions[5] = "Bill";
        */

        display(companions);
    }
}