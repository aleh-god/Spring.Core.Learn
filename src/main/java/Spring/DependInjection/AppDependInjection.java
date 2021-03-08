package Spring.DependInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDependInjection {
    public static void main(String[] args) {
        // Создаем контейнейр (фабрику) объектов (бинов) по правилам записанным в XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Способ - инверсия контроля (передача создания объектов спрингу), но без внедрения зависимостей. Их создаем вручную.
        // Music musicBean= context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        // Внедрение зависимостей. Зависимости прописаны в конфиге Спринга. Получаем готовую систему связанных объектов.
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        // Домашнее задание
        musicPlayer.playMusicList();

        // По умолчанию патерн Scope Singltone - один объект, каждое обращение к бину возвращает одну и туже ссылку в память.
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println("Результат сверки ссылок на объекты: " + comparison);

        // Объект один, одно изменение изменяет все отсылки к объекту плеера.
        firstMusicPlayer.setVolume(10);

        System.out.println("firstMusicPlayer " + firstMusicPlayer.getVolume());
        System.out.println("secondMusicPlayer " + secondMusicPlayer.getVolume());

        context.close();
    }
}
