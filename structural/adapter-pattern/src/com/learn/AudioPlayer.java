package com.learn;

public final class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String file, MediaType type) {
        switch (type) {
            case MP3 -> System.out.println("Playing MP3 song:- " + file);
            // Providing add on functionality via adapter pattern
            case MP4, VLC -> new MediaAdapter(type).play(file, type);
            default -> throw new RuntimeException("Media type not supported:- " + type);
        }
    }
}
