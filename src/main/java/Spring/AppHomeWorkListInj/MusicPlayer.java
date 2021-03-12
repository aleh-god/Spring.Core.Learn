package Spring.AppHomeWorkListInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Component("musicPlayer")
public class MusicPlayer {

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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playListMusic() {
        int i = 0;
        for (Music nextMusic: musicList) {
            i++;
            System.out.println("Play track №"+i);
            System.out.println(nextMusic.getRandomSong());
        }
    }

}
