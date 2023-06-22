package br.com.mymusics.principal;

import br.com.mymusics.models.Favorites;
import br.com.mymusics.models.Music;
import br.com.mymusics.models.Podcast;

public class Principal {
    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Iris");
        myMusic.setSinger("Goo Goo Dolls");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Monark talks");
        myPodcast.setHost("Monark");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        Favorites favorites = new Favorites();
        favorites.include(myMusic);
        favorites.include(myPodcast);

    }
}
