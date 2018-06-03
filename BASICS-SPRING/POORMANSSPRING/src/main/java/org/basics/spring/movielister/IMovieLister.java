package org.basics.spring.movielister;

import java.util.Set;

import org.basics.spring.movelister.pojo.Movie;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public interface IMovieLister {
	
	public void loadMovies();
	
	public Set<Movie> getAllMovies();

}
