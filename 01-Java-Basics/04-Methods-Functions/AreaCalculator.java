class AreaCalculator {

    static int calculateArea(int side) {
        return side * side;
    }

    static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("Area of Square: " + calculateArea(5));
        System.out.println("Area of Rectangle: " + calculateArea(10, 5));
        System.out.println("Area of Circle: " + calculateArea(7.0));
    }
}