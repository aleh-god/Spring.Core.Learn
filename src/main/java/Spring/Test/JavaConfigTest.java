package Spring.Test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Spring.Test")
@PropertySource("classpath:musicPlayer.properties")
public class JavaConfigTest {

}
