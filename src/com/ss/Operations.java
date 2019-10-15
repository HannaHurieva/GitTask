package com.ss;

public class Operations {

    public int add(int firstValue, int secondValue) {
        System.out.println ("This is add method");
        System.out.println("This is add method for 2 params");
        return firstValue + secondValue;
    }

    public int add(int firstValue, int secondValue, int thirdValue) {
        System.out.println("This is add method for 3 params");
        return firstValue + secondValue + thirdValue;
    }

    public int add(int firstValue, int secondValue, int thirdValue, int fourthValue) {
        System.out.println("This is add method for 4 params");
        return firstValue + secondValue + thirdValue + fourthValue;
    }

    public int sub(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int div(int firstValue, int secondValue) {
        if (secondValue == 0) throw new ArithmeticException("Cannot be divided by zero");
        return firstValue / secondValue;
    }

    public int mult(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public double sqrt(int firstValue) {
        return Math.sqrt(firstValue);
    }
}
