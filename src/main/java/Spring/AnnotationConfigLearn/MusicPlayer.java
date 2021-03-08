package Spring.AnnotationConfigLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic music;

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
