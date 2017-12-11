package by.tms;

import javax.annotation.Resource;

public abstract class AbstractRandomWord implements RandomWordImpl {
    @Resource
    public WordGenerator wordGenerator;

    protected abstract String getAlphabet();

    public String generateWord() {
        return wordGenerator.generate(getAlphabet());
    }
}
