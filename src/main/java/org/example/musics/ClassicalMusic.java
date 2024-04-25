package org.example.musics;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    List<String> names = new ArrayList<String>();

    public ClassicalMusic() {
        this.names.add("Beethoven");
        this.names.add("Mozart");
        this.names.add("Tchaikovsky");
    }

    @Override
    public String getSong(){
        return names.toString();
    }

    @Override
    public String toString() {
        return getSong();
    }





}
