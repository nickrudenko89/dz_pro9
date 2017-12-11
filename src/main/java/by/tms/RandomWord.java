package by.tms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RandomWord extends AbstractRandomWord {

    @Autowired
    @Qualifier("numberAlphabet")
    private String alphabet = "";

    public RandomWord() {
    }

    @Override
    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }
}
