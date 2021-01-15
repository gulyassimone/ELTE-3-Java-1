package tvstation.main;

import tvstation.movie.Movie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Company {
    String name;
    List<Movie> movies;
    public Company(Company company) {
        this.movies = new ArrayList<>();
        this.name = company.name;
        for(Movie movie: company.movies){
            this.movies.add(new Movie(movie));
        }
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Company(String name, Movie ...movies) {
        this.movies = new ArrayList<>();
        this.name = name;
        for(Movie movie: movies){
            this.movies.add(new Movie(movie));
        }
    }

    @Override
    public String toString() {
        int start = 12;
        String result = "";
        for(Movie movie:movies){
            result=String.format("%d:00-"+ movie +"|");
            start += movie.getLength();
        }
        return result;
    }

    public Movie createMovie(){
        Movie movie = movies.get(0);
        if(this.movies.size() > 1){
            movies.remove(0);
        }
        return movie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(movies, company.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, movies);
    }
}
