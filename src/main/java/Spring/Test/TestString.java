package Spring.Test;

import org.springframework.stereotype.Component;

@Component
public class TestString implements ActionTest{

    String testString = "See my number: ";

    @Override
    public void goActionTest() {
        System.out.print(testString);
    }
}
