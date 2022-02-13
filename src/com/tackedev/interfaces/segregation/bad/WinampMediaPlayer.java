package com.tackedev.interfaces.segregation.bad;

public class WinampMediaPlayer implements MediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
