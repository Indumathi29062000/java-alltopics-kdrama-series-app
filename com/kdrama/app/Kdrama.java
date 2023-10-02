package com.kdrama.app;

import java.util.Date;
import java.util.List;
//main class that handles this kdrama series app
public class Kdrama {
    protected String title;
    protected String director;
    protected Date released;
    protected String Description;
    protected Genre genre;
    private List<String> actors;
    private int episodes;
	
	
	//constructor
	public Kdrama(String title,String director,Date released,String Description,Genre genre,List<String> actors,int episodes) {
		this.title=title;
		this.director=director;
		this.released=released;
		this.Description=Description;
		this.genre=genre;
		this.episodes=episodes;
		this.actors=actors;	}
	//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getRelease_year() {
		return released;
	}

	public void setRelease_year(Date released) {
		this.released = released;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	
}