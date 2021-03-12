package Spring.AppHomeWorkJavaConfig;


public class Track {

    String name;
    int time;

    public Track(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
