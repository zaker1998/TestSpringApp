package org.example;

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
