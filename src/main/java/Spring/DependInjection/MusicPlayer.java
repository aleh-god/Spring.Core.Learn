package Spring.DependInjection;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private List<Music> musicList = new ArrayList<>();

    // Всегда надо проверять входные данные и не присваивать ссылку напрямую, а перебрать элементы листа в новый лист
    public void setMusicList(List<Music> musicList) {
        if (musicList != null)
            this.musicList.addAll(musicList);
    }

    // Для безопасности отдаем копию поля, а не саму ссылку на поле - ее можно тогда изменить при вызове геттера, так как класс Лист мутабле
    public List<Music> getMusicList() {
        return new ArrayList<>(musicList);
    }

    private String nameSong;
    private int volume;


    // Создание зависимости через конструктор
    // <constructor-arg ref="musicBean"/>
    /**
    public MusicPlayer(Music music) {
        this.music = music;
    }
    */

    // Создание зависимости через сеттер при создании объекта
    public MusicPlayer() {} // Пустой конструктор
    // <property name="music" ref="musicBean"/>
    // Обрезает set берет остальное имя метода
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
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

    public void playMusicList() {
        for (Music musicNext : musicList) {
            System.out.println("Playing: " + musicNext.getSong());
        }

    }

}
