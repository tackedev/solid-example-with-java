package com.tackedev.liskov.substitution.ex3.good;

public abstract class MediaPlayer extends AudioPlayer {

    public void videoPlayer() {
        System.out.println("Playing video...");
    }
}
