class FactorialReturn {

    static int calculateFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int result = calculateFactorial(5);
        System.out.println("Factorial: " + result);
    }
}