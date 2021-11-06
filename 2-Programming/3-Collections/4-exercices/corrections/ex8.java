import java.util.ArrayList;
import java.util.Scanner;

class ex8 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String newWord;

        System.out.println("write stop to stop");
        do {
            newWord = scanner.nextLine();
            words.add(newWord);
        } while (!newWord.equals("stop"));
        
        scanner.close();

        System.out.println("------\nList :");
        for (String word : words) {
            System.out.println(word);
        }
    }    
}