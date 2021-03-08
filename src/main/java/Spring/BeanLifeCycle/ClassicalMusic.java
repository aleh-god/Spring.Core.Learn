package Spring.BeanLifeCycle;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {} // Для использования фабричного метода закрывается конструктор и объект берется через...

    // открытый статический фабричный метод
    // Спринг проверяет вид scope для одного бина или несколько, при использовании фабричного метода
    public static ClassicalMusic getObjectClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Какой-то код для инициализации бина ClassicalMusic , scope=\"singleton\", после его создания.");
        System.out.println("Подключаемся к базе данных, создаем потоки данных и т.п.");
    }

    public void doMyDestroy() {
        System.out.println("Какой-то код для завершения работы бина ClassicalMusic , scope=\"singleton\", перед его уничтожением.");
        System.out.println("Отключаемся от базы данных, закрываем потоки данных и т.п.");
    }

    @Override
    public String getSong() {
        return "Opera";
    }
}
