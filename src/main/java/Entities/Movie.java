package Entities;

/* 
 * Entity class for the movie object, Self explanatory. 
 */

public class Movie {
	private String id; 
	private String title;
	private String leadActor; 
	private String director;
	private String releaseDate; 
	
	public String getReleaseDate() {
		return this.releaseDate; 
	}

	public String getTitle() {
		return this.title;
	}

	public String getActor() {
		return this.leadActor;
	}

	public String getDirector() {
		return this.director;
	}
}
	