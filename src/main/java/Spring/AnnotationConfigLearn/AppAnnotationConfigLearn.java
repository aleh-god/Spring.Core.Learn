package Spring.AnnotationConfigLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationConfigLearn {
    public static void main(String[] args) {

//        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
//        ApplicationContext context = new AnnotationConfigApplicationContext("Spring.AnnotationConfigLearn");

        // applicationContextAnnotation.xml прописан лишь пакет для сканирования анотаций
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        MusicPlayerConstructor rockMusicPlayer = context.getBean("musicPlayerConstructor", MusicPlayerConstructor.class);
        rockMusicPlayer.playMusic();

        MusicPlayerSetter musicPlayerSetter = context.getBean("musicPlayerSetter", MusicPlayerSetter.class);
        musicPlayerSetter.playMusic();

        MusicPlayerField musicPlayerField = context.getBean("musicPlayerField", MusicPlayerField.class);
        musicPlayerField.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

    }

}
