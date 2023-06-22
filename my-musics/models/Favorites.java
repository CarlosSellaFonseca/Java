package br.com.mymusics.models;

public class Favorites {

// Methods

    public void include(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " - Absolute success");
        } else {
            System.out.println(audio.getTitle() + " - Most people like");
        }
    }

}
