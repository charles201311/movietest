package com.bobo.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.movie.dao.MovieMapper;
import com.bobo.movie.domain.Movie;
import com.bobo.movie.service.MovieService;
import com.bobo.movie.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Resource
	private MovieMapper movieMapper;

	@Override
	public List<Movie> selects(MovieVO movieVO) {
		return movieMapper.selects(movieVO);
	}

}
