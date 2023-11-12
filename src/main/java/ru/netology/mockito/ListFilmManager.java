package ru.netology.mockito;

public class ListFilmManager {

    private ListFilmItem[] films = new ListFilmItem[0];
    private int limit = 5;

    public ListFilmManager() {
    }

    public ListFilmManager(int limit) {
        this.limit = limit;
    }

    public void add(ListFilmItem film) {
        int length = films.length + 1;
        ListFilmItem[] tmp = new ListFilmItem[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public ListFilmItem[] findLastTen() {
        int resultLength = films.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        ListFilmItem[] result = new ListFilmItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public ListFilmItem[] findAll() {
        int resultLength = films.length;

        ListFilmItem[] result = new ListFilmItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[i];
        }
        return result;
    }

}
