import java.util.HashMap;

class ex9 {

    public static void main(String[] args) {
        HashMap<String, Character> words = new HashMap<String, Character>();

        words.put("Rose", 'R');
        words.put("Martha", 'M');
        words.put("Donna", 'D');
        words.put("Amy", 'A');
        words.put("Clara", 'C');
        words.put("Bill", 'B');
        
        for (String key : words.keySet()) {
            System.out.println(key + " => " + words.get(key));
        }
    }    
}