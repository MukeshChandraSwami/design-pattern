package com.learn;

public final class MediaAdapter implements MediaPlayer {
    private final AdMediaPlayer adPlayer;
    public MediaAdapter(MediaType type) {
        this.adPlayer = switch (type) {
            case MP4 -> new Mp4Player();
            case VLC -> new VlcPlayer();
            default -> throw new RuntimeException("Advance media player do not support :- " + type.name());
        };
    }

    @Override
    public void play(String file, MediaType type) {
        switch (type) {
            case MP4 -> adPlayer.playMp4(file);
            case VLC -> adPlayer.playVLC(file);
        }
    }
}
