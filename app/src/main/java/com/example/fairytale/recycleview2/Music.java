package com.example.fairytale.recycleview2;

/**
 * Created by Dow on 27/12/2558.
 */
public class Music {
    private String musicName;
    private String mucicArtist;
    private int photo;

    public Music(String musicName, String mucicArtist, int photo) {
        this.musicName = musicName;
        this.mucicArtist = mucicArtist;
        this.photo = photo;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getMucicArtist() {
        return mucicArtist;
    }

    public int getPhoto() {
        return photo;
    }
}
