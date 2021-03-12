package Spring.AppHomeWorkAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHomeWorkAnnot {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigHard.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        System.out.println("Volume" + musicPlayer.getVolume());
        musicPlayer.playMusic(typeMusic.ROCK);
        musicPlayer.playMusic(typeMusic.CLASSICAL);
        musicPlayer.playMusic(typeMusic.ROCK);
        musicPlayer.playMusic(typeMusic.CLASSICAL);
        musicPlayer.playMusic(typeMusic.ROCK);
        musicPlayer.playMusic(typeMusic.CLASSICAL);
    }
}
