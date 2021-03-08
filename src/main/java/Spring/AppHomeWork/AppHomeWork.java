package Spring.AppHomeWork;

import Spring.Test.MainTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHomeWork {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigHard.class);

//        MainTest mainTest = context.getBean("mainTest", MainTest.class);
//
//        mainTest.showTest();



//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("Volume" + musicPlayer.getVolume());
//        musicPlayer.playMusic(typeMusic.ROCK);
//        musicPlayer.playMusic(typeMusic.CLASSICAL);
    }
}
