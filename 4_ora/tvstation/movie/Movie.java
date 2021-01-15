package tvstation.movie;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private Integer length ;
    private String title;

    public Movie(String title) {
        this.title = title;
        this.length = 1;
    }

    public Movie(String title, Integer length) {
        if (length <0 || length > 23){
            throw new IllegalArgumentException("Az adattag nem 0 23 intervallumban van megadva. Megadot adattag:" + length);
        }
        this.title = title;
        this.length = length;
    }
    public Movie(Movie movie) {

        if (movie.length <0 || movie.length > 23){
            throw new IllegalArgumentException("Az adattag nem 0 23 intervallumban van megadva. Megadot adattag:" + length);
        }
        this.title = movie.title;
        this.length = movie.length;
    }

    public boolean canReplace(Movie movie){
        return true;
    }
    public void setTime(Integer length) {
        if (length < 0 || length > 23) {
            throw new IllegalArgumentException("Az adattag nem 0 23 intervallumban van megadva. Megadot adattag:" + length);
        }
        this.length = length;
    }

    public Integer getLength() {
        return length ;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.title == movie.getTitle()?0:1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, title);
    }

    @Override
    public String toString() {
        return String.format("%s[%s]", this.title, this.length<8?"8h":"24h+");
    }
}
