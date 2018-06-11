/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

/**
 *
 * @author ahdieh
 */
public class Movie {
    private String movieName;
    private String movieRating;
    private String movieYear;
    private String movieRuntime;

    public Movie (String movieName, String movieRating, String movieYear, 
            String movieRuntime){
            this.movieName = movieName;
            this.movieRating = movieRating;
            this.movieYear = movieYear;
            this.movieRuntime = movieRuntime;
    }
    public String getMovieName(){
            return this.movieName;
    }
    public void setMovieName(String movieName){
            this.movieName = movieName;
    }
    public String getMovieRating(){
            return this.movieRating;
    }
    public void setMovieRating(String movieRating){
            this.movieRating = movieRating;
    }
    public String getMovieYear(){
            return this.movieYear;
    }
    public void setMovieYear(String movieYear){
            this.movieYear = movieYear;
    }
    public String getMovieRuntime(){
            return this.movieRuntime;
    }
    public void setMovieRuntime(String movieRuntime){
            this.movieRuntime = movieRuntime;
    }
    
    public void ToString(){
        System.out.printf("Your favourite movie is:\nName: %s\nRating: %s\nYear "
                + "of movie created: %s\nRun time: %s mins\n", movieName, 
                movieRating, movieYear, movieRuntime);
    }
}
