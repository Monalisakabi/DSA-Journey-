class SquareNumber {

    static void calculateSquare(int num) {
        int square = num * num;
        System.out.println("Square of " + num + " is: " + square);
    }

    public static void main(String[] args) {
        calculateSquare(5);
        calculateSquare(8);
    }
}