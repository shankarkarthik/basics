package org.basics.spring.movielister;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.basics.spring.movelister.pojo.Movie;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public class CsvFileMovieLister implements IMovieLister {
	
    private Set<Movie> mMovies = new HashSet<Movie>();
    
	public Set<Movie> getAllMovies() {
		return mMovies;
	}

	public void loadMovies(){
		Scanner lScanner;
		lScanner = new Scanner( CsvFileMovieLister.class.getResourceAsStream( "movielister.csv") );
        while ( lScanner.hasNext() ) {
        	String lMovieLine = lScanner.nextLine();
        	String[] lMovieLineSplit = lMovieLine.split( "," );
        	Movie lMovie = new Movie();
        	lMovie.setDirectedBy( lMovieLineSplit[0] );
        	lMovie.setYear( lMovieLineSplit[1] );
        	lMovie.setMovieName( lMovieLineSplit[2] );
        	mMovies.add( lMovie );        	
        }
		
	}
}
