package Spring.ScopePatern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// scope - это область видимости бинов. Скопе задает правила, как Спринг будет создавать бины.
public class AppScope {
    public static void main(String[] args) {
        // Создаем контейнейр (фабрику) объектов (бинов) по правилам записанным в XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextScope.xml"
        );

        // scope="prototype" - патерн, в котором, при кажом запросе бина, возвращается новый бин
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerScope", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerScope", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println("Результат: " + comparison);

        firstMusicPlayer.setVolume(10);

        System.out.println("firstMusicPlayer " + firstMusicPlayer.getVolume());
        System.out.println("secondMusicPlayer " + secondMusicPlayer.getVolume());

        context.close();
    }
}
