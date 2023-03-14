package org.example.LettersCounter;

public class LettersCounter {

    public static int lettersCalculator(char character, String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++)
            if(string.charAt(i) == character){
            result++;
        }
        return result;
    }
}
