class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(4, 4));
        System.out.println(cal.add(4, 4, 4));
    }
}