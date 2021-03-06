package Spring.AnnotationConfigLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Autowired - метку "связь" можно вешать на само поле, конструктор или сеттер

@Component
public class MusicPlayerConstructor {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayerConstructor(Music rockMusic, Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println("Playing Constructor 1: " + rockMusic.getSong());
        System.out.println("Playing Constructor 2: " + classicalMusic.getSong());
    }
}
