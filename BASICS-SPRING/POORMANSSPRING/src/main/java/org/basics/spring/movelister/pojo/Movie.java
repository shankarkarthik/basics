package org.basics.spring.movelister.pojo;

/**
 * 
 * @author Anita Onnuvel
 *
 */
public class Movie {

	private String mDirectedBy;
	private String mYear;
	private String mMovieName;
	public String getDirectedBy() {
		return mDirectedBy;
	}
	public void setDirectedBy(String mDirectedBy) {
		this.mDirectedBy = mDirectedBy;
	}
	public String getYear() {
		return mYear;
	}
	public void setYear(String mYear) {
		this.mYear = mYear;
	}
	public String getMovieName() {
		return mMovieName;
	}
	public void setMovieName(String mMovieName) {
		this.mMovieName = mMovieName;
	}
	
	public String toString() {
		return this.mMovieName + " was directed by " + this.mDirectedBy + " on " + this.mYear ;
	}
}
