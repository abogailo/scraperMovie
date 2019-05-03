package com.abogailo;
public class Scraper {
	private Integer movie_id;
	private String movie_title;
	private Integer movie_release;
	private Integer movie_rating;
	
	
	public Integer getId() {
		return movie_id;
	}
	public void setId(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return movie_title;
	}
	public void setTitle(String movie_title) {
		this.movie_title = movie_title;
	}
	public Integer getReleaseYear() {
		return movie_release;
	}
	public void setReleaseYear(Integer movie_release) {
		this.movie_release = movie_release;
	}
	public Integer getRating() {
		return movie_rating;
	}
	public void setRating(Integer movie_rating) {
		this.movie_rating = movie_rating;
	}
} 