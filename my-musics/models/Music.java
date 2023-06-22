package br.com.mymusics.models;

public class Music extends Audio {

    private String album;
    private String singer;
    private String gender;

// Setters

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

// Getters

    public String getAlbum() {
        return album;
    }

    public String getSinger() {
        return singer;
    }

    public String getGender() {
        return gender;
    }

// Methods

    @Override
    public int getClassification() {
        if (this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

}
