package Spring.QualifierLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {

//    Можно связывать бины с помощью анотации через поля, сеттеры. Для конструкторов определена особая антотация в параметрах конструктора
//    @Autowired
//    @Qualifier("rockMusic")
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    // Для конструкторов определена особая антотация в параметрах конструктора
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing 1: " + music1.getSong());
        System.out.println("Playing 2: " + music2.getSong());
    }

}
