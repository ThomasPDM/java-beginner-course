class ex6 {

    static int compute(int integer) {
        return (integer + 3) * 3;
    }

    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            int integer = compute(i);
            
            if (integer%2 == 0) {
                System.out.println(integer);
            }
        }
    }
}