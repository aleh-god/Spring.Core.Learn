package Spring.AppHomeWorkAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    Random random  = new Random();
    @Autowired
    List<Track> rockList;

    @Override
    public Track getRandomSong() {
        return rockList.get(random.nextInt(3));
    }
}
