package org.example;

import org.example.LettersCounter.LettersCounter;
import org.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(Calculator.addNumbers(2,5));

        System.out.println(LettersCounter.lettersCalculator('s',"springs"));
    }
}
