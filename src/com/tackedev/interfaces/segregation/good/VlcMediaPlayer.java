package com.tackedev.interfaces.segregation.good;

public class VlcMediaPlayer implements AudioPlayable, VideoPlayable {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}
