package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Without dependency injection
        /*Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);*/

        //With dependency injection = no direct initialization of MusicPlayer in class
        MusicPlayer musicPlayerSetterInjection = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayerSetterInjection.playSong();
        System.out.println(musicPlayerSetterInjection.getName());
        System.out.println(musicPlayerSetterInjection.getVolume());

        context.close();
    }
}
