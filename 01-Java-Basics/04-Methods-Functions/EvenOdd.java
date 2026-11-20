class EvenOdd {

    static void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    public static void main(String[] args) {
        checkNumber(15);
        checkNumber(24);
    }
}