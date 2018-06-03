package org.basics.spring.movielister;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.basics.spring.movelister.pojo.Movie;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public class DbMovieLister implements IMovieLister {

private Set<Movie> mMovies = new HashSet<Movie>();
    
    public Set<Movie> getAllMovies() {
        return mMovies;
    }

	public void loadMovies() {
	    try {
            Class.forName( "org.h2.Driver" );
        } catch ( ClassNotFoundException exClassNotFound ) {
            exClassNotFound.printStackTrace();
        } 
	    Path lFilePath = Paths.get( "src/org/basics/spring/movielister/", "movieslister.sql" );
	    String lSqlFile = lFilePath.toUri().toString().substring( 8, lFilePath.toUri().toString().length() );
        //System.out.println( lSqlFile );
        String lDbUrl = "jdbc:h2:~/movie_db;INIT=runscript from '" + lSqlFile + "'";
	    Connection lConnection1 = null;
        PreparedStatement lPreparedStatement1 = null;
	    try {
	        lConnection1 = DriverManager.getConnection( lDbUrl, "sa", "" );
            lPreparedStatement1 = lConnection1.prepareStatement( "INSERT INTO MOVIES (DIRECTED_BY,YEAR,MOVIE_NAME) VALUES('TEST_BY','2012','TEST_NAME')" );
            lPreparedStatement1.executeUpdate();
        } catch ( SQLException exSQL ) {
            exSQL.printStackTrace();
        } finally {
            try {
                lPreparedStatement1.close();
                lConnection1.close(); 
            } catch ( SQLException exSQL ) {
                // TODO Auto-generated catch block
                exSQL.printStackTrace();
            }
                       
        }
	    
        try (
              Connection lConnection = DriverManager.getConnection( "jdbc:h2:~/movie_db", "sa", "" );
              PreparedStatement lPreparedStatement = lConnection.prepareStatement( "SELECT DISTINCT * FROM movies" );
              ResultSet lResultSet = lPreparedStatement.executeQuery();
            ) {
            while( lResultSet.next() ) {
                Movie lMovie = new Movie();
                lMovie.setDirectedBy( lResultSet.getString( "DIRECTED_BY" ) );
                lMovie.setYear( lResultSet.getString( "YEAR" ) );
                lMovie.setMovieName( lResultSet.getString( "MOVIE_NAME" ) );
                mMovies.add( lMovie );
            }
        } catch ( SQLException exSQL ) {
            exSQL.printStackTrace();
        }
  	}
}
