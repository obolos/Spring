package ru.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> classicalList = Arrays.asList("CSong1","CSong2","CSong3");
    @Override
    public String getSong() {
        return classicalList.get(new Random().nextInt(classicalList.size()));
    }
}
