package by.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]) {
        ApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        Object textGenerator = fileSystemXmlApplicationContext.getBean("textGenerator");
        System.out.println(((TextGenerator)textGenerator).generateText());
    }
}
