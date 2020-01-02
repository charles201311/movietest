package com.bobo.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {
	@Resource
	private MovieService  movieService;
 
	@Test
	public void testSelects() {
		MovieVO vo = new MovieVO();
		//vo.setName("黑");
		vo.setLongtimeStart(150);
		vo.setLongtimeEnd(300);
		List<Movie> list = movieService.selects(vo );	
	
	  System.out.println(list);
	}

}
