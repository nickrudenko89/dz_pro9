package by.tms;

import org.springframework.stereotype.Component;

@Component
public class RandomCyrillicWord implements RandomWordImpl {

    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";

    public RandomCyrillicWord() {
    }

    public static String getAlphabet() {
        return alphabet;
    }

    public String generateWord() {
        Object wordGenerator = fileSystemXmlApplicationContext.getBean("wordGenerator");
        return ((WordGenerator)wordGenerator).generate(alphabet);
    }
}
