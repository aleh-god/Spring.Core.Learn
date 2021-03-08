package Spring.AppHomeWork;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {

    Random random  = new Random();

    List<Track> classicalList = new ArrayList<Track>(); {
        classicalList.add(new Track("1. Bah song", 210));
        classicalList.add(new Track("2. Mocart song", 180));
        classicalList.add(new Track("3. Chaikovky song", 120));
    }


    @Override
    public Track getRandomSong() {
        return classicalList.get(random.nextInt(2));
    }
}
