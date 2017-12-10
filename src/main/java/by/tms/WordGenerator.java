package by.tms;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class WordGenerator {

    public WordGenerator() {
    }

    public String generate(String alphabet) {
        Random random = new Random();
        int wordLength = random.nextInt(10);
        char[] generatedWord = new char[wordLength];
        for (int generatedWordLengthCounter = 0; generatedWordLengthCounter < wordLength; generatedWordLengthCounter++) {
            int position = random.nextInt(alphabet.length());
            alphabet.getChars(position, position + 1, generatedWord, generatedWordLengthCounter);
        }
        return String.valueOf(generatedWord);
    }
}
