package by.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public interface RandomWordImpl {
    ApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");

    String generateWord();
}
