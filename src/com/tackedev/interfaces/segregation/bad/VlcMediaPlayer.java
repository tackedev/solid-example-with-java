package com.tackedev.interfaces.segregation.bad;

public class VlcMediaPlayer implements MediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}
