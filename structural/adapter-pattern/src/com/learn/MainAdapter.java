package com.learn;

import static com.learn.MediaType.MP3;
import static com.learn.MediaType.MP4;
import static com.learn.MediaType.VLC;

public class MainAdapter {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play("song1.mp3", MP3);
        player.play("song2.mp4", MP4);
        player.play("song3.vlc", VLC);
    }
}
