package org.example.musics;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    List<String> names = new ArrayList<String>();

    public RockMusic() {
        this.names.add("ACDC");
        this.names.add("NIRVANA");
        this.names.add("METALLICA");
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
