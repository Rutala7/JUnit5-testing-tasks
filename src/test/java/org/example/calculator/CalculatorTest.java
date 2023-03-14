package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.calculator.Calculator.division;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void addNumbers_shouldReturnCorrectSum_withPositiveNumbers() {
        final int actual = Calculator.addNumbers(5, 5);
        final int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addNumbers_shouldReturnCorrectSum_withOnePositiveNumber() {
        final int actual = Calculator.addNumbers(-9, 5);
        final int expected = -4;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addNumbers_shouldReturnCorrectSum_withNegativeNumbers() {
        final int actual = Calculator.addNumbers(-8, -5);
        final int expected = -13;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplication_shouldReturnCorrectMultiplication_withPositiveNumbers() {
        final int expected = 30;
        final int actual = Calculator.multiplication(5, 6);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplication_shouldReturnCorrectMultiplication_withNegativeNumbers() {
        final int expected = 30;
        final int actual = Calculator.multiplication(-5, -6);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplication_shouldReturnCorrectMultiplication_withOneNegativeNumber() {
        final int expected = -30;
        final int actual = Calculator.multiplication(-5, 6);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtraction_shouldReturnCorrectSubtraction_withPositiveNumbers() {
        final int expected = 6;
        final int actual = Calculator.subtraction(8, 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtraction_shouldReturnCorrectSubtraction_withNegativeNumbers() {
        final int expected = 1;
        final int actual = Calculator.subtraction(-8, -9);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void division_shouldReturnCorrectResult_withPositiveNumbers() {
        final int expected = 4;
        final int actual = division(8, 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void division_shouldReturnCorrectResult_withNegativeNumbers() {
        final int expected = 4;
        final int actual = division(-8, -2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void division_shouldReturnCorrectResult_withOnePositiveNumber() {
        final int expected = -4;
        final int actual = division(8, -2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void modulo_shouldReturnCorrectValue_withPositiveNumbers() {
        final int expected = 3;
        final int actual = Calculator.modulo(8, 5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void modulo_shouldReturnCorrectValue_withNegativeNumbers() {
        final int expected = -1;
        final int actual = Calculator.modulo(-6, -5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void modulo_shouldReturnCorrectValue_withOneNegativeNumber() {
        final int expected = 4;
        final int actual = Calculator.modulo(9, -5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testDivisionByZero() {
        int numberOne = 10;
        int numberTwo = 0;
        Exception exception = assertThrows(
                Exception.class,
                () -> division(numberOne, numberTwo));
        String expectedMessage = "Division by zero is not possible.";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
