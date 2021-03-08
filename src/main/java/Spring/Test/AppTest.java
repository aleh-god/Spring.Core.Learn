package Spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigTest.class);

        MainTest mainTest = context.getBean("mainTest", MainTest.class);

        mainTest.showTest();

    }
}
