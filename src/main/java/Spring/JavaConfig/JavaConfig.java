package Spring.JavaConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import java.util.*;

/**
 * Резюме:
 * стараться использовать автоматическую конфигурацию;
 * при автоматической конфигурации указываем имя пакета, где лежат классы, бины которых надо создать;
 * такие классы помечаются аннотацией @Component;
 * спринг проходит по всем таким классам и создает их объекты и помещает себе в контекст;
 * если автоматическая конфиграция нам по каким-то причинам не подходит — используем java-конфигурирование;
 * в таком случае создаем обычный джава класс, методы которого будут возвращать нужные нам объекты, и помечаем такой класс аннотацией @Configuration на случай, если будем сканировать весь пакет целиком, а не указывать конкретный класс с конфигурацией при создании контекста;
 * методы этого класса, которые возвращают бины — помечаем аннотацией @Bean;
 * если хотим подключить возможность автоматического сканирования при использовании java-конфигурации — используем аннотацию @ComponentScan.
 */

// Кроме того, джава-конфигурирование позволяет выполнять абсолютно любой джава-код в методах по созданию бинов.
// Если поля классов надо заполнить объектами (Сетами, Листами, Мапами и т.п.), то их надо описывать как и бины.

@Configuration
public class JavaConfig {

//    бин конфигурируется через метод возвращающий объект
//    @Bean("idBean")
//    @Scope("prototype")
//    public ClassBean nameBean() {
//        return new ClassBean();
//    }

    @Bean("Dog") // id - бина
    @Scope("prototype")
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    public Parrot weNeedMoreParrots() {
        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        return parrot;
    }

    @Bean("Killer")
    public Cat getCat(Parrot parrot) { // Здесь внедряется зависимость
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    // Внедрение через конструктор
    @Bean
    public CollectionsBean getCollectionsBean() {
        return new CollectionsBean(new HashSet<>(Arrays.asList("John", "Adam", "Harry")));
    }

    // Внедрение через поле класса
    @Bean
    public List<String> nameList() {
        return Arrays.asList("John", "Adam", "Harry");
    }

    // Внедрение через сеттер метод
    @Bean
    public Map<Integer, String> nameMap(){
        Map<Integer, String>  nameMap = new HashMap<>();
        nameMap.put(1, "John");
        nameMap.put(2, "Adam");
        nameMap.put(3, "Harry");
        return nameMap;
    }

    // we add the Java configuration factory methods for each SimpleBean element:
    @Bean
    @Qualifier("CollectionBean") // We can use the @Qualifier to select the beans to be injected into the specific collection that matches the @Qualifier name.
    @Order(2) // По желанию, можно задавать очередность заполнения списка
    public SimpleBean getElement() {
        return new SimpleBean("John");
    }

    @Bean
    @Order(1) // We can specify the order of the beans while injecting into the collection.
    @Qualifier("CollectionBean") // We can use the @Qualifier to select the beans to be injected into the specific collection that matches the @Qualifier name.
    public SimpleBean getAnotherElement() {
        return new SimpleBean("Adam");
    }

    @Bean
    @Order(3)
    @Qualifier("CollectionBean") // We can use the @Qualifier to select the beans to be injected into the specific collection that matches the @Qualifier name.
    public SimpleBean getOneMoreElement() {
        return new SimpleBean("Harry");
    }

    @Bean
    //    @Qualifier("CollectionBean")
    public SimpleBean getNextElement() {
        return new SimpleBean("No Collection");
    }

    // If we need an empty list instead of null, we can initialize beanList with a new ArrayList:
    //    @Autowired(required = false)
    //    private List<SimpleBean> beanList = new ArrayList<>();

}
