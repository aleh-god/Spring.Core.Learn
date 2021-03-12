package Spring.AppHomeWorkJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {

    private Random random  = new Random();
    @Autowired
    private List<Track> classicalList;

    @Override
    public Track getRandomSong() {
        return classicalList.get(random.nextInt(3));
    }
}
