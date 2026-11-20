class MultiplyOverloading {

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Multiplication of 2 integers: " + multiply(5, 4));
        System.out.println("Multiplication of 3 integers: " + multiply(2, 3, 4));
        System.out.println("Multiplication of 2 doubles: " + multiply(2.5, 4.0));
    }
}