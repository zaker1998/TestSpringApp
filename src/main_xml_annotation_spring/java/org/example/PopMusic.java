package org.example;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Tailor Swift";
    }

    @Override
    public String toString() {
        return getSong();
    }
}
