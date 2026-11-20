class SumRecursion {

    static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int result = calculateSum(num);

        System.out.println("Sum of first " + num + " natural numbers: " + result);
    }
}