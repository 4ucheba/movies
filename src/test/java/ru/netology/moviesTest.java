package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moviesTest {

    @Test
    public void mustBeFourFilms() {
        moviesManager manager = new moviesManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeOneFilm() {
        moviesManager manager = new moviesManager();

        manager.addFilm("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeZeroFilms() {
        moviesManager manager = new moviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeShownFiveFilms() {
        moviesManager manager = new moviesManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");

        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeShownFourFilms() {
        moviesManager manager = new moviesManager(4);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeShownTwoFilmsWithLimit() {
        moviesManager manager = new moviesManager(4);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");


        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeShownTwoFilmsWithoutLimit() {
        moviesManager manager = new moviesManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");


        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
