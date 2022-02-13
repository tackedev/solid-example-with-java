package com.tackedev.liskov.substitution.ex3.bad;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
