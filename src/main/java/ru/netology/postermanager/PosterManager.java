package ru.netology.postermanager;

public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int lastAddedMovies = 10;

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) tmp[i] = movies[i];
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public PosterManager() {

    }

    public PosterManager(int lastAddedMovies) {
        this.lastAddedMovies = lastAddedMovies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (lastAddedMovies > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = lastAddedMovies;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
