package com.ss;

public class Operations {

    public int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
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
