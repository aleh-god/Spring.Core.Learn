package Spring.AnnotationConfigLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Autowired - метку "связь" можно вешать на само поле, конструктор или сеттер

@Component
public class MusicPlayerSetter {

    private RapMusic music;

    @Autowired
    public void setMusic(RapMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing Setter: " + music.getSong());
    }
}
