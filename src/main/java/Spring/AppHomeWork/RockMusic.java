package Spring.AppHomeWork;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music {

    Random random  = new Random();

    List<Track> classicalList = new ArrayList<Track>(); {
        classicalList.add(new Track("1. Metallica", 120));
        classicalList.add(new Track("2. AC/DC", 90));
        classicalList.add(new Track("3. DDT", 160));
    }

    @Override
    public Track getRandomSong() {
        return classicalList.get(random.nextInt(2));
    }
}
