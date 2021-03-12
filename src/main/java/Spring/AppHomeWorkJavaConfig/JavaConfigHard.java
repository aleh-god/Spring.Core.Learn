package Spring.AppHomeWorkJavaConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class JavaConfigHard {

    @Bean
    public List<Track> rockList() {
        ArrayList<Track> rockList = new ArrayList<>();
        rockList.add(new
                Track("1. Metallica", 120));
        rockList.add(new
                Track("2. AC/DC", 90));
        rockList.add(new
                Track("3. DDT", 160));
        return rockList;
    }

    @Bean
    public List<Track> classicalList() {
        return Arrays.asList(                                       // формирует список на основе массива
                new Track("1. Bah song", 210),
                new Track("2. Mocart song", 180),
                new Track("3. Chaikovky song", 120));
    }

    @Bean("SoloClassical")
    public ClassicalMusic classMusicSolo() {
        return new ClassicalMusic();
    }

    @Bean("SoloRock")
    public RockMusic rockMusicSolo() {
        return new RockMusic();
    }

    @Bean
    @Qualifier("CollectionBean") // С помощью метки можем заряжать по одному простые бины из жаваконфига
    public ClassicalMusic classMusic() {
        return new ClassicalMusic();
    }

    @Bean
    @Qualifier("CollectionBean") // С помощью метки можем заряжать по одному простые бины из жаваконфига
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }


}
