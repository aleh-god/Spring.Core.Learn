package Spring.AppHomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {

//    @Autowired
    private ClassicalMusic classMusic;
//    @Autowired
    private RockMusic rockMusic;
//    @Autowired
//    @Value("${musicPlayer.volume}")
    private int volume;

    private typeMusic tMusic;

//    public MusicPlayer() {}

    @Autowired
    public MusicPlayer(
            @Qualifier("classicalMusic") ClassicalMusic classMusic,
            @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classMusic = classMusic;
        this.rockMusic = rockMusic;
    }

//        public void setMusic(Music classMusic, Music rockMusic) {
//        this.classMusic = classMusic;
//        this.rockMusic = rockMusic;
//    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(typeMusic tMusic) {

        if (tMusic == typeMusic.CLASSICAL)
            System.out.println("Playing: " + classMusic.getRandomSong());
        else if (tMusic == typeMusic.ROCK)
            System.out.println("Playing: " + rockMusic.getRandomSong());
                else System.out.println("No mach type of music.");
    }

}

enum typeMusic {
    ROCK,
    CLASSICAL
};