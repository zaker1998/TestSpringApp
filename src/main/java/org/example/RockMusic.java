package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "ACDC - TNT";
    }

    @Override
    public String toString() {
        return getSong();
    }
}
