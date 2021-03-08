package Spring.AppHomeWork;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Spring.JavaConfigHard")
@PropertySource("classpath:musicPlayer.properties")
public class JavaConfigHard {

}
