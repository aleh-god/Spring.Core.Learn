package Spring.AppHomeWorkJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;


public class RockMusic implements Music {

    Random random  = new Random();
    @Autowired
    List<Track> rockList;

    @Override
    public Track getRandomSong() {
        return rockList.get(random.nextInt(3));
    }
}
