package DTOS;

import java.util.Set;

import Entities.Movie;

/*
 * Dto that represents a quiz to be played between two people. Has constructors that generate questions based on infomration in the Movie Database object. 
 */

public class QuizDto {
	public String question;
	public String answer;
	public Set<String> choices; 
	
	public void createYearQuestion(Movie movie, Set<String> choices) {
		this.question = "What year did " + movie.getTitle() + "release to theaters?";
		this.answer = movie.getReleaseDate();
		this.choices = choices;
	}
	
	public void createActorQuestion(Movie movie, Set<String> choices) {
		this.question = "Who played the leading roll in" + movie.getTitle() + "?";
		this.answer = movie.getActor();
		this.choices = choices;
	}
	
	public void createDirectorQuestion(Movie movie, Set<String> choices) {
		this.question = "Who directed the film" + movie.getTitle() + "?";
		this.answer = movie.getDirector();
		this.choices = choices;
	}
}
