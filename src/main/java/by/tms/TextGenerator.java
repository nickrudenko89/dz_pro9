package by.tms;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

@Component
public class TextGenerator {

    @Resource(name = "randomWord")
    private RandomWordImpl randomWord;

    public String generateText() {
        String text = "";
        Random random = new Random();
        int textLength = random.nextInt(100);
        for (int textLengthCounter = 0; textLengthCounter < textLength; textLengthCounter++) {
            text += randomWord.generateWord() + " ";
        }
        return text;
    }
}
