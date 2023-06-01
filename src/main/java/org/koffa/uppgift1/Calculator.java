package org.koffa.uppgift1;

public class Calculator {
    public void Calculator() {

    }
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if(a == 0 || b == 0) throw new IllegalArgumentException("You can't divide with zero");
        return a / b;
    }
}
