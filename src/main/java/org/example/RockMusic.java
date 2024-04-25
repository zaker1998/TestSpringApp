package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    List<String> names = new ArrayList<String>();

    public RockMusic() {
        this.names.add("ACDC");
        this.names.add("NIRVANA");
        this.names.add("METALLICA");
    }

    @Override
    public String getSong(int randomSongNumber){
        return names.get(randomSongNumber);
    }

}
