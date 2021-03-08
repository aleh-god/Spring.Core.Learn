package Spring.QualifierLearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppQualifier {
    public static void main(String[] args) {
        // Создаем контейнейр (фабрику) объектов (бинов) по правилам записанным в XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "QualifierContext.xml"
        );

        Music music = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer qualifierMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer prototypeMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        prototypeMusicPlayer.setVolume(15);

        System.out.println("qualifierMusicPlayer ");
        qualifierMusicPlayer.playMusic();
        System.out.println("Volume " + qualifierMusicPlayer.getVolume());

        System.out.println("prototypeMusicPlayer ");
        prototypeMusicPlayer.playMusic();
        System.out.println("Volume " + prototypeMusicPlayer.getVolume());

        context.close();
        // Спринг не вызывает destroy-method для scope="prototype" - этот метод нужно вызывать вручную

    }

}
