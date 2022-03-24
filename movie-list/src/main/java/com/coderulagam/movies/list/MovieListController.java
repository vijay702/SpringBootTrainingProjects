package com.coderulagam.movies.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderulagam.movies.dataaccess.MovieListRepository;
import com.coderulagam.movies.model.Movie;


@Controller
@RequestMapping("/")
public class MovieListController {
	
	
@Autowired	
private MovieListRepository movieListRepository;
	
	
@RequestMapping(method=RequestMethod.GET,value="/movies/{actor}")	
public String MovieListByActor(@PathVariable("actor")String name, Model model) {

	
	List<Movie> movieList = movieListRepository.findMoviesByActor(name);
	
	model.addAttribute("movies",movieList);
	return "movie-list";
	
}

@RequestMapping(method=RequestMethod.POST,value="/movies", consumes="application/json")
public ResponseEntity<Object>  addMovie(@RequestBody Movie themovie){
	

	movieListRepository.save(themovie);
	
	return ResponseEntity.ok().build();
	
	
}












}
