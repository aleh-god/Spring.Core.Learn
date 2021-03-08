package Spring.BeanLifeCycle;

public class RapMusic implements Music {
    public void doMyInit() {
        System.out.println("RapMusic, scope=\"singleton\"");
        System.out.println("Подключаемся к базе данных, создаем потоки данных и т.п.");
    }

    public void doMyDestroy() {
        System.out.println("RapMusic, scope=\"singleton\"");
        System.out.println("Отключаемся от базы данных, закрываем потоки данных и т.п.");
    }

    @Override
    public String getSong() {
        return "50 cent";
    }
}
