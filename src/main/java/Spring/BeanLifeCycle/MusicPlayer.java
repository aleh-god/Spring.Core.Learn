package Spring.BeanLifeCycle;

public class MusicPlayer {

    private Music music;
    private int volume;

    // Создание зависимости через сеттер при создании объекта
    public MusicPlayer() {} // Пустой конструктор

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
