package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int multiply(int c) {
        return x * c;
    }

    public int divide(int d) {
        return x / d;
    }

    public int sumAllOperation(int result) {
        return sum(result) + minus(result) + multiply(result) + divide(result);
    }

    public static void main(String[] args) {
        int rsl = sum(1);
        int rsl1 = minus(1);
        Calculator calculator = new Calculator();
        int rsl2 = calculator.multiply(1);
        int rsl3 = calculator.divide(1);
        int rsl4 = calculator.sumAllOperation(1);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}
