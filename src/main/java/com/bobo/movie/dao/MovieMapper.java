package com.bobo.movie.dao;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;

public interface MovieMapper {
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表查询
	 * @param movieVO
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> selects(MovieVO movieVO);
	
	

}
