package Spring.AppHomeWorkListInj;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music {

    Random random  = new Random();
    @Autowired
    List<Track> rockList;

    public void setRockList(List<Track> rockList) {
        this.rockList = rockList;
    }

    @Override
    public Track getRandomSong() {
        System.out.println("Load Rock song...");
        return rockList.get(random.nextInt(3));
    }
}
