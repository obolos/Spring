package ru.springcourse;

public class MusicPlayer {
    private Music music;

    // DI via constructor
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
