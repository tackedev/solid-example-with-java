package com.tackedev.liskov.substitution.ex3.bad;

public abstract class MediaPlayer {

    public void playAudio() {
        System.out.println("Playing audio...");
    }

    public void playVideo() {
        System.out.println("Playing video...");
    }

}
