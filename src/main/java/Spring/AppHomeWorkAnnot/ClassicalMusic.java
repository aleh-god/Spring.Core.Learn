package Spring.AppHomeWorkAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    private Random random  = new Random();
    @Autowired
    private List<Track> classicalList;

    @Override
    public Track getRandomSong() {
        return classicalList.get(random.nextInt(3));
    }
}
