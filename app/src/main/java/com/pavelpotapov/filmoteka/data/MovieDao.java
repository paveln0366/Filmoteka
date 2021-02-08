package com.pavelpotapov.filmoteka.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM movies")
    LiveData<List<Movie>> getAllMovies();

    @Query("SELECT * FROM movies")
    LiveData<List<FavoriteMovie>> getAllFavoriteMovies();

    @Query("SELECT * FROM movies WHERE id == :movieId")
    Movie getMovieById(int movieId);

    @Query("SELECT * FROM favorite_movies WHERE id == :movieId")
    FavoriteMovie getFavoriteMovieById(int movieId);

    @Query("DELETE FROM movies")
    void deleteAllMovies();

    @Insert
    void insertMovie(Movie movie);

    @Delete
    void deleteMovie(Movie movie);

    @Insert
    void insertFavoriteMovie(FavoriteMovie movie);

    @Delete
    void deleteFavoriteMovie(FavoriteMovie movie);
}
