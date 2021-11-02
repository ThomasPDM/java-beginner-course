public class ex3 {

    static int compute(int i, int j) {
        return 2*(i+j);
    }

    public static void main(String[] args) {
        int[][] array2D = new int[5][5];

        // Fill array
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                array2D[i][j] = compute(i, j);
            }
        }

        // Display
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(""); // line return
        }
    }
}