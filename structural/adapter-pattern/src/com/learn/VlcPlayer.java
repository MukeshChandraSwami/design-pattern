package com.learn;

public final class VlcPlayer implements AdMediaPlayer {

    @Override
    public void playMp4(String file) {
        throw new RuntimeException("VLC player can not play mp4 file");
    }

    @Override
    public void playVLC(String file) {
        System.out.println("Playing VLC file :- " + file);
    }
}
