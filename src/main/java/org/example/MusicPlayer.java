package org.example;

import org.example.musics.Music;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
//Spring can even inject dependency to the private fields by using Java Reflection API!
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playSong(){
        Random rnd = new Random();
        return "Music List is : " + musicList.get(rnd.nextInt(3));
    }

}
