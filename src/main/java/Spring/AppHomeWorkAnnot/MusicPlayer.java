package Spring.AppHomeWorkAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classMusic;
    @Autowired
    private RockMusic rockMusic;
    @Autowired
    @Value("${musicPlayer.volume}")
    private int volume;

//    public MusicPlayer() {}
//    public MusicPlayer(
//            ClassicalMusic classMusic,
//            RockMusic rockMusic) {
//        this.classMusic = classMusic;
//        this.rockMusic = rockMusic;
//    }


    public void setClassMusic(ClassicalMusic classMusic) {
        this.classMusic = classMusic;
    }

    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

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