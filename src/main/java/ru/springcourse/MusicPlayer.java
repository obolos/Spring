package ru.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music2) {
        musicList.add(music);
        musicList.add(music2);
    }

    public void playSomeMusic() {
        musicList.forEach(el -> {
            System.out.println("Playing: " + el.getSong());
        });
    }
}
