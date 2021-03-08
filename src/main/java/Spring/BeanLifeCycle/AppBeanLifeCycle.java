package Spring.BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanLifeCycle {
    public static void main(String[] args) {
        // Создаем контейнейр (фабрику) объектов (бинов) по правилам записанным в XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextCycle.xml"
        );

        Music music = context.getBean("rockBean", RockMusic.class);
        Music music2 = context.getBean("rockBean", RockMusic.class);

        Music music3 = context.getBean("rapBean", RapMusic.class);
        Music music4 = context.getBean("rapBean", RapMusic.class);

        Music music5 = context.getBean("classicalBean", ClassicalMusic.class);
        Music music6 = context.getBean("classicalBean", ClassicalMusic.class);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBeanLifeCycle", MusicPlayer.class);

        System.out.println("firstMusicPlayer ");
        firstMusicPlayer.playMusic();

        context.close();
        // Спринг не вызывает destroy-method для scope="prototype" - этот метод нужно вызывать вручную

    }

}
