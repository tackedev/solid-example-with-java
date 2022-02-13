package com.tackedev.interfaces.segregation.good;

public class WinampAudioPlayer implements AudioPlayable {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}
