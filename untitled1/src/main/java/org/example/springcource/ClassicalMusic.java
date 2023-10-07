package org.example.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ClassicalMusic implements Music{
    List<String> musicList = new ArrayList<>(Arrays.asList("toccata and fuge d minor",
            "ods k radosti", "moonshine"));


    @Override
    public List<String> getSong() {
        return musicList;
    }


}
