package com.example.LettersCounter;

import org.example.LettersCounter.LettersCounter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LettersCounterTest {

    @Test
    public void lettersCalculator_shouldReturnCorrectAmountOfCharacters() {
        assertThat(LettersCounter.lettersCalculator('s', "sun is shining")).isEqualTo(3);
    }

    @Test
    public void lettersCalculator_shouldReturnCorrectAmountOfCharacters_whenStringHasNoCharacters() {
        assertThat(LettersCounter.lettersCalculator('c', "sun is shining")).isEqualTo(0);
    }
}
