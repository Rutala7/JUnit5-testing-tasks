package org.example.calculator;

public class Calculator {

    public static int addNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int division(int numberOne, int numberTwo) throws IllegalArgumentException {
        if (numberTwo == 0) {
            throw new IllegalArgumentException("Division by zero is not possible.");
        }
        return numberOne / numberTwo;
    }

    public static int modulo(int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }
}
