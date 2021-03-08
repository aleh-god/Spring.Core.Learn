package Spring.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MainTest {

    @Autowired
    @Qualifier("testString")
    ActionTest test1;

    @Autowired
    @Qualifier("testInt")
    ActionTest test2;

    @Autowired
    ArrayList<ActionTest> actionList = new ArrayList<>();

    public void showTest() {
        test1.goActionTest();
        test2.goActionTest();
    }

    public void showList() {
        for (ActionTest actionNext : actionList) {
            actionNext.goActionTest();
        }
    }
}
