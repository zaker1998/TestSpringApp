package org.example.config;

import org.example.*;
import org.example.musics.ClassicalMusic;
import org.example.musics.Music;
import org.example.musics.PopMusic;
import org.example.musics.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;


@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    Computer computer(){
        return new Computer(musicPlayer());
    }
    @Bean
    public List<Music> musics() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(popMusic());
        musicList.add(classicalMusic());
        return musicList;
        //OR: return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(musics());
    }

}
