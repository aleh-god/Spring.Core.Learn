package Spring.DependInjection;

public class AllMusic implements Music{
    @Override
    public String getSong() {
        return "Random music";
    }
}
