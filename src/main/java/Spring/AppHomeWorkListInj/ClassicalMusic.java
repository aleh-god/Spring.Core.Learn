package Spring.AppHomeWorkListInj;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {

    private Random random  = new Random();
    @Autowired
    private List<Track> classicalList;

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public Track getRandomSong() {
        System.out.println("Load Classical song...");
        return classicalList.get(random.nextInt(3));
    }
}
