package com.learn;

public final class Mp4Player implements AdMediaPlayer {

    @Override
    public void playMp4(String file) {
        System.out.println("Playing MP4 file :- " + file);
    }

    @Override
    public void playVLC(String file) {
        throw new RuntimeException("MP4 player can not play VLC file");
    }
}
