package br.com.mymusics.models;

public class Podcast extends Audio {

    private String host;
    private String description;

// Setters

    public void setHost(String host) {
        this.host = host;
    }

    public void setDescription(String description) {
        this.description = description;
    }

// Getters

    public String getHost() {
        return host;
    }

    public String getDescription() {
        return description;
    }

// Methods

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

}
