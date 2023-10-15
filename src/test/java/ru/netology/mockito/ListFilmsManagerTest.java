package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListFilmsManagerTest {
    ListFilmItems movie1 = new ListFilmItems(1, "Бладшот - Начало.");
    ListFilmItems movie2 = new ListFilmItems(2, "Вперёд");
    ListFilmItems movie3 = new ListFilmItems(3, "Отель Белград");
    ListFilmItems movie4 = new ListFilmItems(4, "Джентльмены");
    ListFilmItems movie5 = new ListFilmItems(5, "Человек-неведимка");
    ListFilmItems movie6 = new ListFilmItems(6, "Тролли.Мировой тур");
    ListFilmItems movie7 = new ListFilmItems(7, "Номер один");
    ListFilmItems movie8 = new ListFilmItems(8, "Морской бой");
    ListFilmItems movie9 = new ListFilmItems(9, "Триггер");
    ListFilmItems movie10 = new ListFilmItems(10, "Кухня");
    ListFilmItems movie11 = new ListFilmItems(11, "Один дома");

    @Test
    public void shouldAddFilm() {
        ListFilmsManager manager = new ListFilmsManager();

        manager.add(movie1);
        manager.add(movie2);

        ListFilmItems[] expected = {movie1, movie2};
        ListFilmItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        ListFilmsManager manager = new ListFilmsManager();
        ListFilmItems[] expected = {};
        ListFilmItems[] actual = manager.findAll();

        Assertions. assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        ListFilmsManager manager = new ListFilmsManager();

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

        ListFilmItems[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        ListFilmItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        ListFilmsManager manager = new ListFilmsManager();

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
        manager.add(movie11);

        ListFilmItems[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        ListFilmItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {
        ListFilmsManager manager = new ListFilmsManager(5);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        ListFilmItems[] expected = {movie1, movie2, movie3, movie4, movie5};
        ListFilmItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenFilms() {
        ListFilmsManager manager = new ListFilmsManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        ListFilmItems[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        ListFilmItems[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit() {
        ListFilmsManager manager = new ListFilmsManager();

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

        ListFilmItems[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        ListFilmItems[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit5() {
        ListFilmsManager manager = new ListFilmsManager(5);

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

        ListFilmItems[] expected = {movie10, movie9, movie8, movie7, movie6};
        ListFilmItems[] actual = manager.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }
}
