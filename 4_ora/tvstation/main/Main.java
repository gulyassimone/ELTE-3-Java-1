package tvstation.main;

import tvstation.movie.Movie;

public class Main {
    public static void main(String[] args){
        Movie m1 = new Movie("m1");
        System.out.println(m1.getLength().equals(1));
        Company c1 = new Company("c1", m1);
        TvStation valami =  new TvStation("tv1", c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1);
        System.out.println(valami.getMovieTitle(1));
    }
}
