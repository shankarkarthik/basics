package org.basics.spring.moviefinder;

import org.basics.spring.movelister.pojo.Movie;
import org.basics.spring.movielister.IMovieLister;
import org.basics.spring.movielister.MovieListerCriteria;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public class MovieFinderService {
	
	private IMovieLister mMovieLister;
	
	public void setMovieLister( IMovieLister pMovieLister ) {
		this.mMovieLister = pMovieLister;
	}
	
	/**
	 * 
	 * @param pMovieListerCriteria
	 * @param pSearchData
	 * @return
	 */
	public Movie findMovie( MovieListerCriteria pMovieListerCriteria, String pSearchData ) {
		this.mMovieLister.loadMovies();
	    Movie lSelectedMovie = null;
		if ( pMovieListerCriteria.equals( MovieListerCriteria.DirectedBy ) ){
			for ( Movie lMovie : mMovieLister.getAllMovies() ){
				if ( lMovie.getDirectedBy().equals( pSearchData ) ){
					lSelectedMovie = lMovie;
					break;
				}
			}
		}
		if ( pMovieListerCriteria.equals( MovieListerCriteria.Year ) ){
			for ( Movie lMovie : mMovieLister.getAllMovies() ){
				if ( lMovie.getYear().equals( pSearchData ) ){
					lSelectedMovie = lMovie;
					break;
				}
			}
		}
		if ( pMovieListerCriteria.equals( MovieListerCriteria.MovieName ) ){
			for ( Movie lMovie : mMovieLister.getAllMovies() ){
				if ( lMovie.getMovieName().equals( pSearchData ) ){
					lSelectedMovie = lMovie;
					break;
				}
			}
		}
		//System.out.println( lSelectedMovie );
		return lSelectedMovie;
	}
}