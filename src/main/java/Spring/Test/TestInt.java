package Spring.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestInt implements ActionTest{
    @Autowired
    @Value("${musicPlayer.volume}")
    int testInt;

    @Override
    public void goActionTest() {
        System.out.print(testInt);
    }
}
