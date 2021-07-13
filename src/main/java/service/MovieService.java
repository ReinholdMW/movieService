package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import DTOS.QuizDto;
import Entities.Movie;

public class MovieService {
	public List<QuizDto> createGeneralQuiz() {
		List<QuizDto> quiz = new ArrayList<>(); 
		List<Movie> movies;// = //fetch five random movies idc how.
		Random rn = new Random(); 
		int min =1; 
		int max =3;
		
		for(int i =0; i< movies.size();i++ ) {
			int randomNumber = rn.nextInt((max - min)+1)+min; 
			quiz.add(createQuestion(randomNumber, movies.get(i)));
		}
		return quiz; 
	}
	
	public QuizDto createQuestion(int randomNumber, Movie movie) {
		QuizDto question = new QuizDto();
		switch( randomNumber) {
		case 1: question = createDirectorQuestion(movie);
			break;
		case 2: question = createActorQuestion(movie); 
			break;
		case 3: question = createYearQuestion(movie); 
			break;
		}
		return question; 
	}
	
	public List<QuizDto> createDirectorQuiz(String director){
		List<QuizDto> quiz = new ArrayList<>();
		List<Movie> movies; // fetch all for name of director
		Random rn = new Random(); 
		int min =2; 
		int max =3;

		for(int i =0; i< movies.size();i++ ) {
			int randomNumber = rn.nextInt((max - min)+1)+min; 
			quiz.add(createQuestion(randomNumber, movies.get(i)));
		}
		
		return quiz; 
	}
	
	public List<QuizDto> createYearQuiz(String year){
		List<QuizDto> quiz = new ArrayList<>();
		List<Movie> movies; // fetch all for year
		
		Random rn = new Random(); 
		int min =1; 
		int max =2;

		for(int i =0; i< movies.size();i++ ) {
			int randomNumber = rn.nextInt((max - min)+1)+min; 
			quiz.add(createQuestion(randomNumber, movies.get(i)));
		}
		
		return quiz; 
	}
	
	private QuizDto createDirectorQuestion(Movie movie) {
		
		QuizDto question = new QuizDto();
		Set<String> choices = new HashSet<>(); // Fetch three random directors with check to make sure that it doesn't include current director
		choices.add(movie.getDirector());
		
		question.createDirectorQuestion(movie, choices);
		
		return question ; 
	}
	
	private QuizDto createActorQuestion(Movie movie) {
		
		QuizDto question = new QuizDto();
		Set<String> choices = new HashSet<>(); // Fetch three random actos with check to make sure that it doesn't include current actor
		choices.add(movie.getActor());
		
		question.createActorQuestion(movie, choices);
		
		return question ; 
	}
	
	private QuizDto createYearQuestion(Movie movie) {
		
		QuizDto question = new QuizDto();
		Set<String> choices = new HashSet<>(); // Fetch three random years with check to make sure that it doesn't include current years
		choices.add(movie.getReleaseDate());
		
		question.createYearQuestion(movie, choices);
		
		return question ; 
	}
}
