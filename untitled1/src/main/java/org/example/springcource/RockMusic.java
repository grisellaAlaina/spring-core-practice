package org.example.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> musicList = new ArrayList<>(Arrays.asList("ich will",
            "rodina", "high way to hell"));


    @Override
    public List<String> getSong() {
        return musicList;
    }
}
