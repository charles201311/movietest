package com.bobo.movie.vo;

import com.bobo.movie.domain.Movie;
/**
 * 
 * @ClassName: MovieVO 
 * @Description: 电影的vo对象.用来封装前端传递的来的参数
 * @author: charles
 * @date: 2019年8月30日 下午4:37:33
 */
public class MovieVO extends Movie {
	
	private String  uptimeStart;//开始时间
	private String  uptimeEnd;//结束时间
	private Double   priceStart;//开始价格
	private Double   priceEnd;//结束价格
	private Integer LongtimeStart;//开始时长
	private Integer LongtimeEnd;//结束时长
	
	private String orderColumn;//排序的字段
	private String orderMethod;//排序的方法
	
	
	
	
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public String getUptimeStart() {
		return uptimeStart;
	}
	public void setUptimeStart(String uptimeStart) {
		this.uptimeStart = uptimeStart;
	}
	public String getUptimeEnd() {
		return uptimeEnd;
	}
	public void setUptimeEnd(String uptimeEnd) {
		this.uptimeEnd = uptimeEnd;
	}
	public Double getPriceStart() {
		return priceStart;
	}
	public void setPriceStart(Double priceStart) {
		this.priceStart = priceStart;
	}
	public Double getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(Double priceEnd) {
		this.priceEnd = priceEnd;
	}
	public Integer getLongtimeStart() {
		return LongtimeStart;
	}
	public void setLongtimeStart(Integer longtimeStart) {
		LongtimeStart = longtimeStart;
	}
	public Integer getLongtimeEnd() {
		return LongtimeEnd;
	}
	public void setLongtimeEnd(Integer longtimeEnd) {
		LongtimeEnd = longtimeEnd;
	}
	
	
}
