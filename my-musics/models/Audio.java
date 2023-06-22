package br.com.mymusics.models;

public class Audio {

    private String title;
    private int totalPlays;
    private int totalLikes;
    private int classification;

// Setters

    public void setTitle(String title) {
        this.title = title;
    }

// Getters

    public String getTitle() {
        return title;
    }

    public int getTotalReproductions() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

// Methods

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }

}
