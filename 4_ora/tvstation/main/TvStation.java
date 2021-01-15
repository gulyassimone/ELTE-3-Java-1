package tvstation.main;

import tvstation.movie.Movie;

import java.util.Arrays;
import java.util.Optional;

public class TvStation {
    String name;
    Company[] companies;
    Movie[] movies;

    public TvStation(String name, Company  ...companies) {
        this.name = name;
        this.companies = new Company[companies.length];
        for(int i = 0; i<companies.length; ++i){
            this.companies[i] = new Company(companies[i]);
        }
    }

    public String getName() {
        return name;
    }
    String getMovieTitle(Integer value){
        Optional<Movie> result = Arrays.stream(movies).filter(elem -> elem.getLength() == value).findFirst();
        return result == null ? "(no movie)": result.get().getTitle();
    }
    public void makeMovie(int index, Integer length){
        companies[index].createMovie();
        if (length <0 || length > 23){
            throw new IllegalArgumentException("Az adattag nem 0 23 intervallumban van megadva. Megadot adattag:" + length);
        }

    }

    public void makeMovie(String name, Integer length){
        findCompanyByName(name).createMovie();
        if (length <0 || length > 23){
            throw new IllegalArgumentException("Az adattag nem 0 23 intervallumban van megadva. Megadot adattag:" + length);
        }
    }
    public Company findCompanyByName(String name){
        Optional<Company> result = Arrays.stream(companies).filter(element -> element.getName().equals(name)).findFirst();
        if(result == null){
            throw new IllegalArgumentException("A cég név nincs a listában");
        }
        return result.get();
    }
    public int processMoviesFromFile(String filename){
        return 0;
    }

    @Override
    public String toString() {
        String result="";
        for(Company company:companies){
            result+=String.format("%s(", company.getName());
            result+=")\\n";
        }
        return result;
    }
}
