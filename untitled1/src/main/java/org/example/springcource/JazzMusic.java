package org.example.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class JazzMusic implements Music{
    List<String> musicList = new ArrayList<>(Arrays.asList("ipanema boy", "hit the road Jack", "chooo choo ch bogie"));


    @Override
    public List<String> getSong() {
        return musicList;
    }
}
