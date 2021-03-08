package Spring.JavaConfig;

public class SimpleBean {

    private String name;

    public SimpleBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
