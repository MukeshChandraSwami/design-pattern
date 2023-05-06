package com.learn;

public sealed interface MediaPlayer permits AudioPlayer, MediaAdapter {

    void play(String file, MediaType type);
}
