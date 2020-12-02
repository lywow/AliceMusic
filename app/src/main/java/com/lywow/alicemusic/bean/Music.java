package com.lywow.alicemusic.bean;

import android.graphics.Bitmap;

import androidx.recyclerview.widget.RecyclerView;

public class Music {

    private String title;//歌名
    private String artist;//歌唱者
    private String album;//专辑名
    private int length;
    private Bitmap albumBip;//专辑图片
    private String path;
    private boolean isPlaying;

    public Music(){ }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Bitmap getAlbumBip() {
        return albumBip;
    }

    public void setAlbumBip(Bitmap albumBip) {
        this.albumBip = albumBip;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
