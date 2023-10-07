package org.example.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.springcource.MusicType.ROCK;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;
    @Autowired
    @Qualifier("jazzMusic")
    private Music music3;


    public String play(MusicType musicTypeEnum) {
        Random random = new Random();
        int randInt = random.nextInt(3);

        switch (musicTypeEnum) {
            case ROCK:
                return "Playing : " + music2.getSong().get(randInt);
            case CLASSICAL:
                return "Playing : " + music.getSong().get(randInt);
            case JAZZ:
                return "Playing : " + music3.getSong().get(randInt);
        }
        return null;
    }
}