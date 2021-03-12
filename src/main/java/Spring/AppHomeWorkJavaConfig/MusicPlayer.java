package Spring.AppHomeWorkJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Component("musicPlayer")
public class MusicPlayer {

    @Autowired
    @Qualifier("SoloClassical") // С помощью метки можем заряжать по одному простые бины из жаваконфига
    private ClassicalMusic classMusic;
    @Autowired
    @Qualifier("SoloRock") // С помощью метки можем заряжать по одному простые бины из жаваконфига
    private RockMusic rockMusic;
    @Autowired
    @Qualifier("CollectionBean") // С помощью метки можем заряжать по одному простые бины из жаваконфига
    private List<Music> musicList;

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

    public void getVolume() {
        System.out.println("Volume player:");
        System.out.print("[");
        for (int i = 0 ; i < 50 ; i++) {
            if (i == 24) {
                System.out.print(volume+"%");
            } else if (i == 25) continue;
            else if (i == 26) continue;
            else if (i < (int) (volume/2)) System.out.print(">");
            else System.out.print("-");
        }
        System.out.println("]");
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

    public void playListMusic() {
        System.out.println("ListMusic start play:");
        for (Music nextMusic: musicList
             ) {
            System.out.println(nextMusic.getRandomSong());
        }
    }

}

enum typeMusic {
    ROCK,
    CLASSICAL
};