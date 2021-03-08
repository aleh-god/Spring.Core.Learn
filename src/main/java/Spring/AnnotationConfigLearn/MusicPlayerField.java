package Spring.AnnotationConfigLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Autowired - метку "связь" можно вешать на само поле, конструктор или сеттер

@Component
public class MusicPlayerField {

    @Autowired
    private ClassicalMusic music;

    public void playMusic() {
        System.out.println("Playing Field: " + music.getSong());
    }

}
