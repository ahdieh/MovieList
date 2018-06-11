/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;
import java.util.Scanner;

/**
 *
 * @author ahdieh
 */
public class MovieList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String movieName;
       String movieRating;
       String movieYear;
       String movieRuntime;
       
       Scanner in = new Scanner(System.in);
       System.out.print("Please enter your favorite movie's name, its rating, "
               + "the year is created, its run time in minutes: ");
       movieName = in.next();
       movieRating = in.next();
       movieYear = in.next();
       movieRuntime = in.next();
       
       Movie movie = new Movie(movieName, movieRating, movieYear, movieRuntime);
       movie.ToString();
    }
    
}
