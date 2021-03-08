package Spring.QualifierLearn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class RockMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("RockMusic, scope=\"prototype\"");
        System.out.println("Подключаемся к базе данных, создаем потоки данных и т.п.");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("RockMusic, scope=\"prototype\"");
        System.out.println("Отключаемся от базы данных, закрываем потоки данных и т.п.");
    }
    @Override
    public String getSong() {
        return "Metallica";
    }
}
