package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static org.example.MusicGenre.*;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
//Spring can even inject dependency to the private fields by using Java Reflection API!
    private Music rockMusic;
    private Music classicalMusic;

    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playSong(Enum MusicGenre){
        Random rnd = new Random();
        if(MusicGenre==CLASSICAL)
        {
           return "Volume and Name = " + volume + " / " + name + " / " +
            "Playing Music: " + classicalMusic.getSong(rnd.nextInt(3));
        }
        if(MusicGenre==ROCK)
        {
            return "Volume and Name = " + volume + " / " + name + " / " +
                    "Playing Music: " + rockMusic.getSong(rnd.nextInt(3));
        }
        return "";
    }

}
