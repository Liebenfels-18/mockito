package ru.netology.mockito;

public class ListFilmsManager {

    private ListFilmItems[] films = new ListFilmItems[0];
    private int limit = 10;

    public ListFilmsManager() {
    }

    public ListFilmsManager(int limit) {
        this.limit = limit;
    }

    public void add(ListFilmItems film) {
        int length = films.length + 1;
        ListFilmItems[] tmp = new ListFilmItems[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public ListFilmItems[] findLastTen() {
        int resultLength = films.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        ListFilmItems[] result = new ListFilmItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public ListFilmItems[] findAll() {
        int resultLength = films.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        ListFilmItems[] result = new ListFilmItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[i];
        }
        return result;
    }
}
