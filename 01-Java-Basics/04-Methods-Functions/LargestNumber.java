class LargestNumber {

    static void findLargest(int a, int b) {
        if (a > b) {
            System.out.println("Largest number: " + a);
        } else if (b > a) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        findLargest(25, 40);
    }
}