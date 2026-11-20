class StaticMethodExample {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {

        // Calling static method directly
        staticMethod();

        // Creating an object to call instance method
        StaticMethodExample obj = new StaticMethodExample();
        obj.instanceMethod();
    }
}