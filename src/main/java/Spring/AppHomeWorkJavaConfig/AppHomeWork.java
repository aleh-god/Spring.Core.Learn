package Spring.AppHomeWorkJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHomeWork {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigHard.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.getVolume();
        musicPlayer.playMusic(typeMusic.ROCK);
        musicPlayer.playMusic(typeMusic.CLASSICAL);
        musicPlayer.playListMusic();
    }
}
