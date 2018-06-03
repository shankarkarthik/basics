package org.basics.spring._2.poormans.spring;

import java.util.Properties;

import org.basics.spring.movelister.pojo.Movie;
import org.basics.spring.moviefinder.MovieFinderService;
import org.basics.spring.movielister.IMovieLister;
import org.basics.spring.movielister.MovieListerCriteria;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public class PoorMansSpringContainer {

    private static PoorMansSpringContainer mPoorMansSpringContainer = new PoorMansSpringContainer();
    
    static Properties mProperties = new Properties();

    static {
        mProperties.setProperty( "CsvFileMovieLister", "org.basics.spring.movielister.CsvFileMovieLister" );
        mProperties.setProperty( "DbMovieLister", "org.basics.spring.movielister.DbMovieLister" );
    }
	
	public static PoorMansSpringContainer getInstance() {
	    return mPoorMansSpringContainer;
	}
	
	private PoorMansSpringContainer(){
	}
	
    /**
	 * 
	 * @param pArgs
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
    public void load() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		MovieFinderService lMovieFinderService = new MovieFinderService();
		Class<IMovieLister> lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "CsvFileMovieLister" ) );
		//Class<IMovieLister> lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "DbMovieLister" ) );
		IMovieLister lMovieLister = ( IMovieLister ) lMovieListerClass.newInstance();
		lMovieFinderService.setMovieLister( lMovieLister );
		Movie lMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
		System.out.println( "Poor Man's Spring :: From File ::" + lMovie );
		//System.out.println( "Poor Man's Spring :: From Db ::" + lMovie );

/*		lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "DbMovieLister" ) );
        lMovieLister = ( IMovieLister ) lMovieListerClass.newInstance();
        lMovieLister.loadMovies();
        lMovieFinderService.setMovieLister( lMovieLister );
        lMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
        System.out.println( "Poor Man's Spring :: From Db ::" + lMovie );
*/
    }
    
    
    public IMovieLister getFileMovieLister() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        MovieFinderService lMovieFinderService = new MovieFinderService();
        Class<IMovieLister> lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "CsvFileMovieLister" ) );
        //Class<IMovieLister> lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "DbMovieLister" ) );
        IMovieLister lMovieLister = ( IMovieLister ) lMovieListerClass.newInstance();
        return lMovieLister;
    }

    public IMovieLister getDbMovieLister() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        MovieFinderService lMovieFinderService = new MovieFinderService();
        Class<IMovieLister> lMovieListerClass = ( Class<IMovieLister> ) Class.forName( mProperties.getProperty( "DbMovieLister" ) );
        IMovieLister lMovieLister = ( IMovieLister ) lMovieListerClass.newInstance();
        return lMovieLister;
    }

}
