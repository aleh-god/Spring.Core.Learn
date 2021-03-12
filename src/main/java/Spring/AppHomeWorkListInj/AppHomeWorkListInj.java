package Spring.AppHomeWorkListInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHomeWorkListInj {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigListInj.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        System.out.println("Volume =" + musicPlayer.getVolume());
        musicPlayer.playListMusic();
    }
}
