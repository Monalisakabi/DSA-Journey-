class LargestOfThree {

    static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = findLargest(10, 25, 15);
        System.out.println("Largest number: " + result);
    }
}