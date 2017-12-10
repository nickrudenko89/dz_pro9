package by.tms;

import org.springframework.stereotype.Component;

@Component
public class RandomNumberWord implements RandomWordImpl {

    private static final String alphabet = "0123456789";

    public RandomNumberWord() {
    }

    public static String getAlphabet() {
        return alphabet;
    }

    public String generateWord() {
        Object wordGenerator = fileSystemXmlApplicationContext.getBean("wordGenerator");
        return ((WordGenerator)wordGenerator).generate(alphabet);
    }
}
