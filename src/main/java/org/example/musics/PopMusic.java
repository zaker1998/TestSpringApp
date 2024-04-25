package org.example.musics;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {

    List<String> names = new ArrayList<String>();

    public PopMusic() {
        this.names.add("Taylor");
        this.names.add("Drake");
        this.names.add("21");
    }


    @Override
    public String getSong() {
        return names.toString();
    }

    @Override
    public String toString() {
        return getSong();
    }
}
