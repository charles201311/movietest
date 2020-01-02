package com.bobo.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;
/**
 * 
 * @ClassName: MovieController 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月31日 上午10:47:29
 */
@Controller
public class MovieController {

	@Resource
	private MovieService movieService ;
	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO
	 * @param movieVO
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("selects")
	public String selects(MovieVO movieVO, Model model) {
		
		List<Movie> movies = movieService.selects(movieVO);	
		model.addAttribute("movies", movies);
		model.addAttribute("movieVO", movieVO);
		
		return "movies";
		
		
		
	}
}
