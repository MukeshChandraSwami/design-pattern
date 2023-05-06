package com.learn;

public sealed interface AdMediaPlayer permits VlcPlayer, Mp4Player {

    void playMp4(String file);
    void playVLC(String file);
}
