package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){
    }

    public static ClassicalMusic constructClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing My Initialization!");
    }

    public void doMyDestroy() {
        System.out.println("Doing My Destruction!");
    }
    @Override
    public String getSong(){
        return "Vivaldi - Four Seasons";
    }

    @Override
    public String toString() {
        return getSong();
    }




}
