package ru.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> rockList = Arrays.asList("RSong1","RSong2","RSong3");
    @Override
    public String getSong() {
        return rockList.get(new Random().nextInt(rockList.size()));
    }
}
