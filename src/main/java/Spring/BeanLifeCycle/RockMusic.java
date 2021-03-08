package Spring.BeanLifeCycle;

public class RockMusic implements Music {
    public void doMyInit() {
        System.out.println("RockMusic, scope=\"prototype\"");
        System.out.println("Подключаемся к базе данных, создаем потоки данных и т.п.");
    }

    public void doMyDestroy() {
        System.out.println("RockMusic, scope=\"prototype\"");
        System.out.println("Отключаемся от базы данных, закрываем потоки данных и т.п.");
    }
    @Override
    public String getSong() {
        return "Metallica";
    }
}
