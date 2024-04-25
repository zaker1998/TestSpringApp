package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        //Without dependency injection
        /*Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);*/

        //With dependency injection = no direct initialization of MusicPlayer in class
        /*MusicPlayer musicPlayerSetterInjection1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayerSetterInjection1.playSong();
        System.out.println(musicPlayerSetterInjection1.getName());
        System.out.println(musicPlayerSetterInjection1.getVolume());

        MusicPlayer musicPlayerSetterInjection2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        Music rockMusic = context.getBean("rockMusicBean", Music.class);
        Music classicalMusic = context.getBean("classicalMusicBean", Music.class);
        Music popMusic = context.getBean("popMusicBean", Music.class);

        musicPlayerSetterInjection2.setMusics(Arrays.asList(rockMusic, classicalMusic, popMusic));
        musicPlayerSetterInjection2.playSong();*/

        context.close();
    }
}
