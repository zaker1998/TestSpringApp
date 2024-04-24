package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musics = new ArrayList<Music>();

    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(List<Music> musics){
        this.musics = musics;
    }

    public void playSong(){
        System.out.println("Playing Music: " + musics);
    }

    public List<Music> getMusic() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
