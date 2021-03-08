package Spring.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfig {
    public static void main(String[] args) {
        // java-конфигурация для создания объектов.
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Cat cat = context.getBean("Killer", Cat.class);
        Parrot parrot = context.getBean(Parrot.class);
        Dog dog = (Dog) context.getBean("Dog");

        System.out.println(parrot.getName());
        System.out.println(cat.getName());
        System.out.println(dog.getName());

        CollectionsBean collectionsBean = context.getBean(CollectionsBean.class);
        collectionsBean.printNameList();
        collectionsBean.printNameSet();
        collectionsBean.printBeanList();

        collectionsBean.printNameListWithDefaults();
    }
}
