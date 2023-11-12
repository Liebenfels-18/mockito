package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListFilmManagerTest {
    ListFilmItem movie1 = new ListFilmItem(1, "Бладшот - Начало.");
    ListFilmItem movie2 = new ListFilmItem(2, "Вперёд");
    ListFilmItem movie3 = new ListFilmItem(3, "Отель Белград");
    ListFilmItem movie4 = new ListFilmItem(4, "Джентльмены");
    ListFilmItem movie5 = new ListFilmItem(5, "Человек-неведимка");
    ListFilmItem movie6 = new ListFilmItem(6, "Тролли.Мировой тур");
    ListFilmItem movie7 = new ListFilmItem(7, "Номер один");
    ListFilmItem movie8 = new ListFilmItem(8, "Морской бой");
    ListFilmItem movie9 = new ListFilmItem(9, "Триггер");
    ListFilmItem movie10 = new ListFilmItem(10, "Кухня");

    @Test
    public void shouldAddFilm() {
        ListFilmManager manager = new ListFilmManager();

        manager.add(movie1);
        manager.add(movie2);

        ListFilmItem[] expected = {movie1, movie2};
        ListFilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        ListFilmManager manager = new ListFilmManager();
        ListFilmItem[] expected = {};
        ListFilmItem[] actual = manager.findAll();

        Assertions. assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        ListFilmManager manager = new ListFilmManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ListFilmItem[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        ListFilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastFilms() {
        ListFilmManager manager = new ListFilmManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ListFilmItem[] expected = {movie10, movie9, movie8, movie7, movie6};
        ListFilmItem[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsLimit7() {
        ListFilmManager manager = new ListFilmManager(7);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ListFilmItem[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4};
        ListFilmItem[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsLimit3() {
        ListFilmManager manager = new ListFilmManager(3);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        ListFilmItem[] expected = {movie10, movie9, movie8};
        ListFilmItem[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }
}

