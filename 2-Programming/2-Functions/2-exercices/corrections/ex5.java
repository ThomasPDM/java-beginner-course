class ex5 {

    static double compute(double a, double b, char operator) {
        double result;

        switch (operator) {
            case '+': {
                result = a+b;
            } break;

            case '-': {
                result = a-b;
            } break;

            case '*': {
                result = a*b;
            } break;

            case '/': {
                result = a/b;
            } break;

            case '%': {
                result = a%b;
            } break;

            default: {
                result = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("5+5 = " + compute(5, 5, '+'));
        System.out.println("5-5 = " + compute(5, 5, '-'));
        System.out.println("5*5 = " + compute(5, 5, '*'));
        System.out.println("5/5 = " + compute(5, 5, '/'));
        System.out.println("5%5 = " + compute(5, 5, '%'));
    }
}