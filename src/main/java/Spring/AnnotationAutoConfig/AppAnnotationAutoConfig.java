package Spring.AnnotationAutoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotationAutoConfig {

    public static void main(String[] args) {
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext context = new AnnotationConfigApplicationContext("Spring.AnnotationConfig");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        cat.setName("Пушистик");
        parrot.setName("Задира");
        dog.setName("Рыцарь");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
