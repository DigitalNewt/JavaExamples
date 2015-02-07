package com.usergravity.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Brent Baker
 * Date: 10/31/13
 * Time: 10:58 AM
 */
public class Movie {
    private String title;
    private String runTime;
    private String url;
    private List<String> actors;
    private List<String> directors;
    private List<String> writers;
    private List<String> producers;
    private Date release;
    private String rating;
    private List<String> genre;
    private String synopsis;

    public Movie() {
        actors = new ArrayList<String>();
        directors = new ArrayList<String>();
        writers = new ArrayList<String>();
        producers = new ArrayList<String>();
        genre = new ArrayList<String>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
