package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> names = new ArrayList<String>();

    public ClassicalMusic() {
        this.names.add("Beethoven");
        this.names.add("Mozart");
        this.names.add("Tchaikovsky");
    }

    @Override
    public String getSong(int randomSongNumber){
        return names.get(randomSongNumber);
    }





}
