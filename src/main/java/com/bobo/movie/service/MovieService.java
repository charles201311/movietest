package com.bobo.movie.service;

import java.util.List;

import com.bobo.movie.domain.Movie;
import com.bobo.movie.vo.MovieVO;
/**
 * 
 * @ClassName: MovieService 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月31日 上午10:47:50
 */
public interface MovieService {

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
